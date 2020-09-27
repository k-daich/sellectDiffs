#!/bin/bash

mvn clean package

ls -l target

java -jar target/sellectDiffs-1.0-SNAPSHOT-jar-with-dependencies.jar 903

