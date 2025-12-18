# Korus Inject

## Purpose
Pure API module providing core dependency injection annotations and interfaces.

## Characteristics
- **Zero framework dependencies**: Only depends on Jakarta APIs and compile-time annotations
- **Pure API**: Contains only annotations and interfaces
- **Foundation layer**: All other Korus modules build on this

## Module Type
**API Module** - Defines contracts for dependency injection

## Dependencies
- `jakarta.inject-api` - JSR-330 standard annotations
- `jakarta.annotation-api` - Standard lifecycle annotations
- JetBrains and JSpecify annotations (compile-time only)

## Usage
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>inject</artifactId>
</dependency>
```

## Content
This module will contain:
- Core DI annotations (extending JSR-330)
- Scope definitions
- Qualifier annotations
- Injection point metadata interfaces

