#!/usr/bin/env sh

set -e

if [ "$1" = 'java' ]; then
  shift
  java -Djdk.tls.client.protocols=TLSv1.2 -XX:+UnlockExperimentalVMOptions -XX:MaxRAMPercentage=85 "$@"
else
  exec "$@"
fi
