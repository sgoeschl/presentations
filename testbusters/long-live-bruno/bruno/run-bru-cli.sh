#!/usr/bin/env bash

SITE="${1:-prod}"

# Decrypt the env.age.text files recursively using age and an identity file
./decrypt-dotenv.sh

# Deleting previous reports
rm -f report.html

# Run BRU CLI
bru run --env "$SITE" --reporter-html report.html