theme: Merriweather,8
# Everything You Always Wanted To Know About OpenAPI
#### Siegfried GOESCHL, ASCIIFISH

--- 

![inline](./images/everything-you-want-to-know.jpg)

---

# What Is OpenAPI?

---

## What Is OpenAPI?

> The OpenAPI Specification, previously known as the Swagger Specification, is a specification for machine-readable interface files for describing, producing, consuming, and visualizing RESTful web services
-- Wikipedia

---

## Swagger And OpenAPI

| Year  | Event                                                     |
| ------| --------------------------------------------------------- |
| 2010  | Swagger development began in early 2010 by Tony Tam       |
| 2015  | SmartBear purchased the Swagger API development           |
| 2016  | Renamed from Swagger to OpenAPI                           |
| 2017  | OpenAPI 3.0.0 release                                     |
| 2021  | OpenAPI 3.1.0 release                                     |

^
- A little bit of history lesson
- Swagger and OpenAPI are mostly the same things

---

## Why Bother With OpenAPI?

---

## Obstacles To Consuming APIs[^1]

![inline](./images/state-of-the-api-report-2022-01.jpg)

[^1]: Postman 2022 State Of The API Report

---

![fit](./images/disturbing-lack-of-documentation.jpg)

---

## Improving API Documentation[^1]

![inline](./images/state-of-the-api-report-2022-02.jpg)

[^1]: Postman 2022 State Of The API Report

---

## OpenAPI Ticks Most Boxes

* Up-to-date documentation :heavy_check_mark:
* Better examples :heavy_check_mark:
* Standardized documentation :heavy_check_mark:
* Better documentation work flow :heavy_check_mark:
* Try it / interactive documentation :heavy_check_mark:

---

![fit](./images/i-am-interested-continue.jpg)

---

# OpenAPI Overview

---

## Before We Deep Dive

* OpenAPI definitions are written in YAML or JSON
  * YAML is easier to read
  * JSON/YAML conversion in Online Swagger Editor
* OpenAPI files must include its OpenAPI Specification version, e.g. "openapi: 3.0.0"

^ 
- See "YAML Considered Harmful", Philipp Krenn

---

## OpenAPI 3.0 Basic Structure

![inline](./images/openapi3structure.png)

--- 

## Info Section

```yaml
info:
  title: Swagger Petstore - OpenAPI 3.0
  description: >-
    This is a sample Pet Store Server based on the OpenAPI 3.0 specification. 
    You can find out more about ...
  termsOfService: 'http://swagger.io/terms/'
  contact:
    email: apiteam@swagger.io
  license:
    name: Apache 2.0
    url: 'http://www.apache.org/licenses/LICENSE-2.0.html'
  version: 1.0.17
```

---

![inline](./images/openapi-info-section.jpg)

--- 

## Servers Section

```yaml
servers:
  - url: http://localhost:8080
  - url: http://petstore.swagger.io/v1
```

---

## Security Section

```yaml
components:
  securitySchemes:
    petstore_auth:
      type: oauth2
      flows:
        implicit:
          authorizationUrl: 'https://petstore3.swagger.io/oauth/authorize'
          scopes:
            'write:pets': modify pets in your account
            'read:pets': read your pets
    api_key:
      type: apiKey
      name: api_key
      in: header
      security:
        - petstore_auth:
            - 'write:pets'
            - 'read:pets'      

```

---

## Security Section

```yaml
paths:
  /pet:
    put:
      tags:
        - pet
      summary: Update an existing pet
      description: Update an existing pet by Id
      operationId: updatePet
      requestBody:
      responses:
      security:
        - petstore_auth:
            - 'write:pets'
            - 'read:pets'
```

---


![inline](./images/openapi-authorization-section.jpg)

--- 

## Paths Section

```yaml
paths:
  /pet:
    put:
      tags:
        - pet
      summary: Update an existing pet
      description: Update an existing pet by Id
      operationId: updatePet
      requestBody:
        description: Update an existent pet in the store
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/Pet'
        required: true
```
---

![inline](./images/openapi-path-section.jpg)

--- 

## Tags Section

```yaml
tags:
  - name: pet
    description: Everything about your Pets
    externalDocs:
      description: Find out more
      url: 'http://swagger.io'
  - name: store
    description: Access to Petstore orders
    externalDocs:
      description: Find out more about our store
      url: 'http://swagger.io'
  - name: user
    description: Operations about user
```

^
- Provide better overview
- Tag names are used for code generation

---

![inline](./images/openapi-tags-section.jpg)

---

## Components Section

```yaml
components:
  schemas:
    Category:
      type: object
      properties:
        id:
          type: integer
          format: int64
          example: 1
        name:
          type: string
          example: Dogs
```

^
- The reusable parts of your OpenAPI definition

---

![inline](./images/openapi-components-section.jpg)

---

# Design Or Code First?!

---

![](./images/pexels-alison-burrell-195226.jpg)

^
- For single-person projects the code first approach might be fine

---

## Design First - The Good

* Improved documentation quality
* Early review of REST API design/changes 
* Code generation possible

^
Controller code is ugly - has more annotations than source code

---

## Design First - The Bad

* Learning curve for developers
  * Writing first OpenAPI file is hard
  * Having good template helps
* Code & design can be out of sync
  * Code generation for rescue

---

## Design First Tooling

* IntelliJ 
* Visual Studio Code with OpenAPI extension
* Online Swagger Editor
* Vim with OpenAPI plugin (for the real nerds)

---

![inline](./images/intellij-openapi-integration.jpg)

^ 
- Bi-directional syncing
- Manual reload of changes required

---

![inline](./images/visual-code-openapi-integration.jpg)


---

![inline](./images/swagger_editornew.png)

^
- Best OpenAPI validation

---

![inline](./images/vim-openapi-integration.png)

^
- For real nerds only

---

#  Source Code Generation

---

## Server & Client Generators

![inline](./images/openapi-generators.jpg)

^
Using the OpenAPI website or Maven plugin

---  

## openapi-generator-maven-plugin

```xml
<configuration>
    <inputSpec>
        ${project.basedir}/src/main/resources/petstore-openapi-3.yaml
    </inputSpec>
    <generatorName>spring</generatorName>
    <apiPackage>com.github.sgoeschl.openapi.demo.api</apiPackage>
    <modelPackage>com.github.sgoeschl.openapi.demo.model</modelPackage>
    <supportingFilesToGenerate>ApiUtil.java</supportingFilesToGenerate>
    <configOptions>
        <delegatePattern>true</delegatePattern>
        <discriminatorCaseSensitive>false</discriminatorCaseSensitive>
        <hideGenerationTimestamp>true</hideGenerationTimestamp>
        <openApiNullable>false</openApiNullable>
        <useTags>true</useTags>
    </configOptions>
</configuration>
```

---

## openapi-generator-maven-plugin

* There are many different Java source code generators
  * Spring Boot 2 & 3, Micronaut, JAX-RS, ...
* Plus interesting client options
  * Javascript, Typescript, Swift, ...
* Review the generated source code
  * Generators are from varying quality

---

## OpenAPI Spring Boot Generator

* Spring Boot 2 & 3 support
* `delegatePattern` separates generated & written code
* Skipping `openApiNullable` and additional Jackson library
* `useTags` is nice since it generates an interface per tag
* `hideGenerationTimestamp` to keep you and Git happy

---

## Generated APIs

```
src/main/java/com/github/sgoeschl/openapi/demo/rest/api

|-- ApiUtil.java
|-- PetApi.java
|-- PetApiController.java
|-- PetApiDelegate.java
|-- StoreApi.java
|-- StoreApiController.java
|-- StoreApiDelegate.java
```

---

## Generated Model Classes

```
src/main/java/com/github/sgoeschl/openapi/demo/rest/model

|-- Address.java
|-- Category.java
|-- Customer.java
|-- ModelApiResponse.java
|-- Order.java
|-- Pet.java
|-- Tag.java
```

---

## Controller Using Delegate Pattern

```java
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.swaggerPetstoreOpenAPI30.base-path:/api/v3}")
public class PetApiController implements PetApi {

    private final PetApiDelegate delegate;

    public PetApiController(
        @Autowired(required = false) PetApiDelegate delegate) {
        this.delegate = ofNullable(delegate).orElse(new PetApiDelegate() {});
    }

    @Override
    public PetApiDelegate getDelegate() {
        return delegate;
    }
}
```

---

## Bean Validation In Action

```java
  @Min(0) @Max(99) 
  @Schema(
    name = "nrOfPersons", 
    example = "2", 
    description = "Number of persons to live in the rental property", 
    required = false)
  public Integer getNrOfPersons() {
    return nrOfPersons;
  }
```

---

## openapi-generator-maven-plugin

* We are generating `Typescript` and `Java` code
  * Java code is used 1:1 by backend devs
  * Typescript as inspiration for FE devs

--- 

# OpenAPI Tips And Tricks

---

## Get Your Hands Dirty

--- 

![inline](./images/fear-of-writing.jpg)

^ 
- You could become Shakespeare for OpenAPI writing 
- Start with an existing OpenAPI template

--- 

![inline](./images/openapi-website.jpg)

^ 
- Checkout https://www.openapis.org
- Helps your writing OpenAPI specifications

---

![inline](./images/zalando-rest-api-guidelines.jpg)

^ 
Helps your writing better REST APIs

---

![inline](./images/api_design_ptterns-book.jpg)

^ 
Helps your desiging better REST APIs

---

## Combine And Extend Model Definitions

---

![inline](./images/combine.and-extemd-model-definitions.jpg)

^
- You have a bunch of response pages
- Paging support adds a lot of boiler-plate code

---

## Combine And Extend Model Definitions

``` yaml
components:
  schemas:    
    ResponsePage:
      description: "Models a paginated search result."
      properties:
        totalResults:
          type: integer
          description: "Indicate how many results would be included if pagination were complete."
          minimum: 0
        self:
          description: "Pagination link|cursor pointing to the current page."
          type: string
        first:
          description: "Pagination link|cursor pointing to the first page."
          type: string
        prev:
          description: "Pagination link|cursor pointing to the previous page."
          type: string
        next:
          description: "Pagination link|cursor pointing to the next page."
          type: string

```

^
- Define and re-use ResponsePage

---

## Combine And Extend Model Definitions

``` yaml
components:
  schemas:    
    ExchangeTenantViewResponsePage:
      type: object
      description: Response page
      allOf:
        - $ref: '#/components/schemas/ResponsePage'
      properties:
        items:
          type: array
          items:
            $ref: '#/components/schemas/ExchangeTenantView'
```
---

## Configure JWT Authentication 

^
- You want to provide interactive OpenAPI file
- Your endpoints 

---

## Configure JWT Authentication 

* Bearer token authentication
* Support non-authenticated endpoints

---

![inline](./images/openapi-jwt-authentication-01.jpg)

---

![inline](./images/openapi-jwt-authentication-02.jpg)

---

```yaml
security:
  - bearerAuth: [ ] # secure all endpoints (default)

components:
  securitySchemes:
    bearerAuth:
      type: http
      scheme: bearer
      bearerFormat: JWT
```

---

```yaml    
paths:
  /api/exchanges/tenant-profile:
    get:
      tags:
        - Exchange
      summary: Public view of the tenant profile secured by a token
      operationId: getPublicExchangeTenantProfile
      security: [ ]  # Disable security - public method
```

---

![](./images/pexels-miguel-padrian-clockwork.jpg)

--- 

## OpenAPI Integrations

* Configuration of your Web Application Firewall (WAF)
  * WAF OpenAPI support by NGINX, F5
* Configuration of Amazon API Gateway 
* Swagger Parsers for custom integrations

--- 

# Conclusion / Best Practices

* OpenAPI design-first approach is recommended
* Code generation to sync between definition and code
* Improved developer experience, e.g. Gitlab, pull requests, ..
* Bootstrap Postman collection from OpenAPI import

^
- Design-first results in better REST APIs
- Bean validation works nicely with generated code
- Generated Postman collection still requires manual work

---

# And last bot not least

---

![inline](./images/learn-rinse-repeat.jpg)

---

![](./images/questions-and-answers.jpg)

---

# Resources

* [https://www.openapis.org](https://www.openapis.org)
* [https://editor.swagger.io](https://editor.swagger.io)
* [https://github.com/OpenAPITools/openapi-generator](https://github.com/OpenAPITools/openapi-generator)
* [https://openapi-generator.tech/docs/generators/spring/](https://openapi-generator.tech/docs/generators/spring/)
* [https://opensource.zalando.com/restful-api-guidelines/](https://opensource.zalando.com/restful-api-guidelines/)
* [https://www.manning.com/books/api-design-patterns](https://www.manning.com/books/api-design-patterns)

---

# Resources

* [https://www.postman.com/state-of-api](https://www.postman.com/state-of-api)
* [https://github.com/sgoeschl/presentations/tree/master/javameetup/openapi](https://github.com/sgoeschl/presentations/tree/master/javameetup/openapi)
* [Swagger Parser](https://github.com/swagger-api/swagger-parser)
