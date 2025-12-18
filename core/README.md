# Korus Core

## Purpose
Foundation module providing core utilities and abstractions used throughout the Korus framework.

## Characteristics
- **No DI dependencies**: Does not depend on inject/inject-java
- **General utilities**: Common utilities that can be used independently
- **Stable foundation**: Minimal and focused

## Module Type
**Foundation Utilities Module**

## Dependencies
- `slf4j-api` - Logging facade
- JetBrains and JSpecify annotations (compile-time only)

## Usage
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>core</artifactId>
</dependency>
```

## Content
This module will contain:
- Exception hierarchy
- Common utility classes
- Configuration abstractions
- Lifecycle interfaces (non-DI specific)
- Reflection utilities
- Type system utilities

## Design Principles
- **DI-agnostic**: Can be used without the DI framework
- **Focused**: Only genuinely shared utilities
- **Low-level**: No high-level framework concerns
- **Minimal dependencies**: Only logging and compile-time annotations
