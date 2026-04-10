#!/usr/bin/env bash
# Decrypt the env.age.text files recursively using age and an identity file
if ! command -v age >/dev/null 2>&1; then
  err "'age' CLI is not installed or not on PATH."
  exit 1
fi
export AGE_IDENTITY_FILE=".key"
find . -type f -name 'env.age.txt' -exec sh -c '
  f="$1"
  dir=${f%/*}
  echo "Decrypting $f to $dir/.env"
  age --decrypt --identity ${AGE_IDENTITY_FILE:-.key} --output "$dir/.env" "$f"
' sh {} \;