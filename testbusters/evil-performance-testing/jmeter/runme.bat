@ECHO OFF
RMDIR /Q /S target
DEL jmeter.log

CALL jmeter -n -t httpbin-jmeter.jmx -q sites/local/smoketest.properties -l target/result.jtl -e -o target
