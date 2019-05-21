#!/bin/sh


java -Djava.security.egd=file:/dev/./urandom -Dspring.cloud.config.uri=$GUTENBERG_CONFIG_URI -Dspring.profiles.active=$PROFILE -jar /app.jar

