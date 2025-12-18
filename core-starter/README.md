# Korus Core Starter

## Purpose
Aggregator module that bundles all essential Korus dependencies for user applications.
This is the recommended way for users to depend on Korus.

## Characteristics
- **Aggregator only**: Contains no code, only dependency declarations
- **User-focused**: Designed for application developers
- **Complete bundle**: Includes API + runtime infrastructure

## Module Type
**Starter/Aggregator Module**

## Aggregated Dependencies
This starter includes:
- `inject` - Core DI API
- `inject-java` - Java-specific DI extensions
- `core` - Core utilities
- `context` - Runtime infrastructure

## Usage

### Simplest Approach
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>core-starter</artifactId>
</dependency>
```

### Recommended Approach
Use with `korus-build-parent`:

```xml
<parent>
    <groupId>io.korus</groupId>
    <artifactId>korus-build-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</parent>

<dependencies>
    <dependency>
        <groupId>io.korus</groupId>
        <artifactId>core-starter</artifactId>
    </dependency>
    
    <!-- Add your logging implementation -->
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
    </dependency>
</dependencies>
```

## What's NOT Included
- **Logging implementation**: Users must choose their own SLF4J implementation
- **Annotation processor**: Configured automatically by korus-build-parent

## Design Principles
- **No surprises**: Only aggregates, doesn't add functionality
- **No forced choices**: No logging or infrastructure decisions
- **Convention over configuration**: Works with build-parent for zero-config experience

## When NOT to Use
- Framework module development (use specific modules)
- When you need fine-grained control (depend on modules individually)
- Build tools or extensions (use specific modules)