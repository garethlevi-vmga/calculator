#!/bin/bash -e

ARTIFACT_ID=$(mvn -q -Dexec.executable="echo" -Dexec.args='${project.artifactId}' --non-recursive exec:exec)
POM_VERSION=$(mvn -q -Dexec.executable="echo" -Dexec.args='${project.version}' --non-recursive exec:exec)

mvn clean package -Dmaven.javadoc.skip=true
docker build --build-arg ARTIFACT_ID=${ARTIFACT_ID} --build-arg POM_VERSION=${POM_VERSION} -t ${ARTIFACT_ID}:latest -t ${ARTIFACT_ID}:${POM_VERSION} .
