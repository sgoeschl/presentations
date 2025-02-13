#!/bin/sh

export JMETER_SITE=local
export JMETER_SCOPE=endurance

rm -r ./target

jmeter -n -t httpbin-jmeter.jmx -Jsite=$JMETER_SITE -q sites/$JMETER_SITE/$JMETER_SCOPE.properties -l target/result.jtl -e -o target
