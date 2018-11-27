gatling-maven-plugin-demo
=========================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute one of the following commands

```
mvn gatling:test -Dgatling.simulationClass=postman.HelloWorldSimulation
mvn gatling:test -Dgatling.simulationClass=postman.PostmanSimulation
mvn gatling:test -Dgatling.simulationClass=computerdatabase.BasicSimulation
```