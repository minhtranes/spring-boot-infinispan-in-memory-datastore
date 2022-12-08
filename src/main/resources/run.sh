#!/bin/sh

JAR_FILE=infinispan-in-memory-datastore.jar
CURRENT_DIR=$PWD

java $JAVA_OPTS \
    -jar $JAR_FILE