# Korus HTTP Server

## Purpose
Parent POM for **all HTTP server-related Korus framework modules**. This module provides:

- Module aggregation for HTTP components
- Shared dependency management for Vert.x stack
- Common HTTP server properties and configuration
- Build coordination across REST, server, and client modules

## Modules
- `http-rest` - HTTP abstractions and REST metadata
- `http-vertx` - Vert.x-based HTTP server implementation
- `rest-client` - HTTP client for outbound calls

## Usage
Internal framework modules should declare this as their parent:

```xml
<parent>
    <groupId>io.korus</groupId>
    <artifactId>http-server</artifactId>
</parent>
