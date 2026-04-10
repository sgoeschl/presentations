#!/usr/bin/env bash
# Encrypt the .env file recusively using age and a recipient
if ! command -v age >/dev/null 2>&1; then
  err "'age' CLI is not installed or not on PATH."
  exit 1
fi
export AGE_RECIPIENT_ID="age1a84zu6rvd6e7azdd8pf5gya7ena2mj8sufcxq6sdg3hfyqaxgucqzp75y6"
find . -type f -name '.env' -exec sh -c '
  f="$1"
  dir=${f%/*}
  echo "Encrypting $f to $dir/env.age.txt"
  age --encrypt --armor --recipient "${AGE_RECIPIENT_ID:?AGE_RECIPIENT_ID is required}" --output "$dir/env.age.txt" "$f"
' sh {} \;