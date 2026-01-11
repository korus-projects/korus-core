# Korus HTTP REST

## Purpose
Foundation module providing HTTP abstractions and REST metadata structures.
Defines common HTTP types and metadata contracts used by both server and client.

## Characteristics
- **Zero dependencies**: Pure Java implementation
- **Shared abstractions**: Used by http-vertx server and rest-client
- **Jakarta REST integration**: Metadata structures for JAX-RS compatibility
- **Framework-agnostic**: No Vert.x or server-specific code

## Module Type
**Foundation/Abstractions Module**

## Dependencies
- `jakarta.ws.rs:jakarta.ws.rs-api` (provided scope)

## Usage
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>http-rest</artifactId>
</dependency>
