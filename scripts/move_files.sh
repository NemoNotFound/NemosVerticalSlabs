#!/usr/bin/env bash

set -euo pipefail

SRC_BASE="../src/main/generated"

get_block_ids_from_path() {
  local mod_id="$1"
  local recipe_path="$SRC_BASE/data/nemos_vertical_slabs/recipe"

  local block_ids=()

  if [[ -d "$recipe_path" ]]; then
    for file in "$recipe_path"/*; do
      [[ -f "$file" ]] || continue

      # Skip if mod_id not in file
      if ! grep -q "$mod_id" "$file"; then
        continue
      fi

      # Try parsing JSON
      block_id=$(jq -r '.result.id // empty' "$file" 2>/dev/null || true)

      if [[ -n "$block_id" ]]; then
        # remove namespace (before :)
        block_ids+=("${block_id#*:}")
      fi
    done
  fi

  echo "${block_ids[@]}"
}

move_file() {
  local src="$1"
  local dest="$2"

  if [[ -f "$dest" ]]; then
    if cmp -s "$src" "$dest"; then
      echo "Files identical, delete new one: $src"
      rm "$src"
    else
      echo "Files differ, replace old one: $dest"
      rm "$dest"
      mkdir -p "$(dirname "$dest")"
      mv "$src" "$dest"
    fi
  else
    mkdir -p "$(dirname "$dest")"
    mv "$src" "$dest"
    echo "File moved: $src -> $dest"
  fi
}

move_files_to_destination() {
  local mod_id="$1"
  local dest_id="$2"
  local path_suffix="$3"
  shift 3
  local block_ids=("$@")

  local path="$SRC_BASE/$path_suffix"

  [[ -d "$path" ]] || return

  while IFS= read -r -d '' file; do
    local should_move=false

    # Read content safely
    content=$(cat "$file" 2>/dev/null || echo "")

    # Check mod_id
    if grep -q "$mod_id" <<<"$content"; then
      should_move=true
    fi

    # Check block_ids in content
    for id in "${block_ids[@]}"; do
      if grep -q "$id" <<<"$content"; then
        should_move=true
        break
      fi
    done

    # Check filename
    filename=$(basename "$file")
    for id in "${block_ids[@]}"; do
      if [[ "$filename" == "$id.json" ]]; then
        should_move=true
        break
      fi
    done

    if [[ "$should_move" == true ]]; then
      rel_path="${file#$SRC_BASE/}"
      dest_base="../src/main/resources/resourcepacks/$dest_id"
      dest_path="$dest_base/$rel_path"
      move_file "$file" "$dest_path"
    fi

  done < <(find "$path" -type f -print0)
}

move_files() {
  local mod_id="$1"
  local dest_id="$2"

  read -r -a block_ids <<< "$(get_block_ids_from_path "$mod_id")"

  move_files_to_destination "$mod_id" "$dest_id" "assets/nemos_vertical_slabs/models/block" "${block_ids[@]}"
  move_files_to_destination "$mod_id" "$dest_id" "assets/nemos_vertical_slabs/items" "${block_ids[@]}"
  move_files_to_destination "$mod_id" "$dest_id" "data/nemos_vertical_slabs/loot_table/blocks" "${block_ids[@]}"
  move_files_to_destination "$mod_id" "$dest_id" "data/nemos_vertical_slabs/recipe" "${block_ids[@]}"
  move_files_to_destination "$mod_id" "$dest_id" "data/nemos_vertical_slabs/advancement/recipes" "${block_ids[@]}"
}

# Example usage
move_files "nemos_mossy_blocks" "mossy_vertical_slabs"
move_files "biomesoplenty" "biomesoplenty_vertical_slabs"
move_files "biomeswevegone" "biomeswevegone_vertical_slabs"