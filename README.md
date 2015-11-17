# Restskeleton
Restskeleton is a small Rest application written in Java and using [RestEasy 3](http://resteasy.jboss.org/) + [Spring 3](http://spring.io/) + [Maven 3](https://maven.apache.org/).

The RestEasy is used to create the web resources, Spring to inject and manages the dependencies and [Gson](https://github.com/google/gson) is used to convert object into JSON.

You can use it to prototype your Rest API or in production, why not? ;)

(*This project uses an embedded version of Jetty.*)

## Dependencies
* **Java** 7
* **Maven** 3
* **Servlet-api** 3.x

## Library versions
* **RestEasy** 3.0.x
* **Spring** 3.2.x
* **Gson** 2.4

## How to install?
```sh
$ mvn clean install
```

## How to run?
```sh
$ mvn jetty:run
```

## How to test if is runnig?
To see the results of the rest services, you can access:


**Product service test:**

[http://localhost:8080/rest/product](http://localhost:8080/rest/product)
```json
{
  "success": "It's working :)"
}
```

***

**Get product by id:**

[http://localhost:8080/rest/product/123](http://localhost:8080/rest/product/123)
```json
{
  "id": 123,
  "name": "Silent Hill 2",
  "description": "Game Silent Hill 2",
  "keywords": [
    "silent hill 2",
    "game",
    "playstation 2",
    "xbox",
    "pc"
  ]
}
```

## Where can I edit this resource?
You can change or add a new Resource inside the package:
```
src/main/java/me/madureira/restskeleton/resources/
```

## The unit test for this resource are in:
```
src/test/java/me/madureira/restskeleton/resources/ProductResourceTest.java
```

I hope you enjoy :)
