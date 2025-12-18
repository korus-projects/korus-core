# Korus Inject Java

## Purpose
Java-specific extensions to the core injection API. Provides language-specific annotations and features.

## Characteristics
- **Extends inject**: Builds on `inject` module
- **Java-specific**: Contains annotations specific to Java language features
- **Still API-only**: No implementation logic

## Module Type
**API Extension Module** - Java-specific DI contracts

## Dependencies
- `inject` - Core DI API

## Usage
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>inject-java</artifactId>
</dependency>
```

## Content
This module will contain:
- Java-specific annotations (e.g., method interception, AOP)
- Java reflection-based utilities
- Java-specific scope definitions
- Language-level integration points