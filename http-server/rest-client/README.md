# Korus REST Client

## Purpose
HTTP client module for making outbound HTTP calls to other services.
Provides both declarative (interface-based) and low-level HTTP client APIs.

## Characteristics
- **Microservice communication**: Built for service-to-service calls
- **Vert.x powered**: Uses Vert.x WebClient for non-blocking I/O
- **Declarative client**: Interface-based client generation (like Feign)
- **Reactive support**: Async/reactive and blocking APIs
- **Metadata driven**: Uses same annotations as server (@GET, @POST, etc.)

## Module Type
**Client Infrastructure Module**

## Dependencies
- `io.korus:http-rest` - HTTP abstractions and annotations
- `io.vertx:vertx-web-client` - Vert.x HTTP client

## Usage
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>rest-client</artifactId>
</dependency>
