#!/bin/sh

java -server -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1 $JAVA_OPTS -jar $1
