# FreeMarker Spring Boot Demo Application 

On the one hand this project shows Apache FreeMarker features and Spring Boot integration and on the other hand serves as a blue-print for Java backend developers requiring a quick & dirty frontend - basically for people like me :)

The following features are provided by this blue-print

* Auto-reloading of FreeMarker templates
* Integration of <a href="https://getbootstrap.com">Bootstrap 4</a> for a pleasant UI experience
* Application icon and favicon by the courtesy of <a href="https://www.iconsdb.com">ICONSDB</a>
* Decent error page for the Web UI to replace Spring white-label error handler

## Auto-reloading of FreeMarker Templates

Bascially you have to tell Apache Freemarker to load the templates from the source location and avoid template caching.

* Enable the local configuration, i.e. `-Dspring.profiles.active=local`
* Set the working directory to the root of `demo/app` 

and provide the following properties from `application-local.properties`

```text
spring.freemarker.cache=false
spring.freemarker.prefer-file-system-access=true
spring.freemarker.template-loader-path=file:./src/main/resources/templates
```

## Bootstrap Integration

Plain-vanilla HTML does not cut it any longer :-)

## Artwork

Having a proper `favicon.ico` is nice when you pin tab in the browser

## Error Page

Spring Boot's white-label error page just sucks ...