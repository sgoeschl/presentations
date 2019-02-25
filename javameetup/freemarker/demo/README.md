# FreeMarker Spring Boot Demo Application 

On the one hand this project shows Apache FreeMarker features and Spring Boot integration and on the other hand serves as a blue-print for Java backend developers requiring a quick & dirty frontend - basically for people like me :)

The following features are provided by this blue-print

* Advanced templating layout
* Auto-reloading of FreeMarker templates
* Support of HTTP cache headers
* Integration of <a href="https://getbootstrap.com">Bootstrap 4</a> for a pleasant UI experience
* Application icon and favicon by the courtesy of <a href="https://www.iconsdb.com">ICONSDB</a>
* Decent error page for the Web UI to replace Spring white-label error handler

## Advanced Templating Layout

While some of my colleagues think that building a Web UI with a JVM template engine is completely retarded (well, it is) sometime there is no need for `node.js` when you just want to render plain JSON content. Having said that you can still use some advanced templating as shown below, e.g.

```
<#import "layout/bootstrap-layout.ftl" as layout>

<@layout.page>
    <h2>Spring Boot FreeMarker Demo</h2>
    <p>Demo project to provide a production ready Spring Boot FreeMarker sample project</p>
    <ul>
        <li>Auto-reloading of FreeMarker templates</li>
        <li>Integration of <a href="https://getbootstrap.com">Bootstrap 4</a> for a pleasant UI experience</li>
        <li>Application icon and favicon by the courtesy of <a href="https://www.iconsdb.com">ICONSDB</a></li>
        <li>Built-in server error handling</li>
    </ul>
</@layout.page>
```

renders the index page with main menu with Bootstrap integration.

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

## HTTP Cache Headers Support

As backend developer it is painful to see static HTML pages delivered without HTTP cache headers - the blue-pring project

* Enables caching of static content
* Provides a `HttpCacheHeaderFilter` to customize caching of your more or less static FTL pages

```
@Bean
public FilterRegistrationBean<OncePerRequestFilter> httpCacheHeaderFilter() {
    final FilterRegistrationBean<OncePerRequestFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new HttpCacheHeaderFilter(staticPageCacheTimeToLive / 1_000));
    registrationBean.addUrlPatterns("/");
    return registrationBean;
}
```

## Bootstrap Integration

Plain-vanilla HTML does not cut it any longer :-)

## Artwork

Having a proper `favicon.ico` is nice when you pin tab in the browser

## Error Page

Spring Boot's white-label error page just sucks ...