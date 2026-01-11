# Korus HTTP Vert.x Server

## Purpose
Production-ready HTTP server implementation using Eclipse Vert.x.
Executes Jakarta REST endpoints with reactive, non-blocking architecture.

## Characteristics
- **Runtime infrastructure**: Actual HTTP server that runs applications
- **Vert.x powered**: Built on Eclipse Vert.x 5.x and Netty
- **Metadata consumer**: Uses RouteMetadata from annotation processor
- **Non-blocking**: Reactive I/O with event loop architecture
- **Jakarta REST compatible**: Runs standard JAX-RS endpoints

## Module Type
**Runtime Server Implementation Module**

## Dependencies
- `io.korus:http-rest` - HTTP abstractions and metadata
- `io.vertx:vertx-core` - Vert.x core runtime
- `io.vertx:vertx-web` - HTTP routing and handlers
- `io.vertx:vertx-web-validation` - Request validation
- `io.vertx:vertx-config` - Configuration management
- `io.vertx:vertx-health-check` - Health endpoints
- `io.vertx:vertx-micrometer-metrics` - Metrics integration
- `io.vertx:vertx-opentelemetry` - Distributed tracing

## Usage
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>http-vertx</artifactId>
    <scope>runtime</scope>
</dependency>
