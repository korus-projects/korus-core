# Korus Core Processor

## Purpose
**Build-time only** annotation processor for Korus framework. Performs compile-time analysis, 
validation, and metadata generation.

## Characteristics
- **Build-time only**: Never appears in runtime classpath
- **Processor implementation**: Contains actual annotation processing logic
- **Metadata generation**: Generates code/metadata consumed by runtime

## Module Type
**Build-Time Infrastructure Module**

## Dependencies
- `inject` - API to process
- `inject-java` - Java-specific APIs to process
- `jandex` - Class/annotation indexing
- `gizmo` - Bytecode generation
- `auto-service` - Processor registration (build-time only)

## Usage

### For Framework Development
```xml
<dependency>
    <groupId>io.korus</groupId>
    <artifactId>core-processor</artifactId>
    <scope>provided</scope>
</dependency>
```

### For User Applications
Users should **not** declare this dependency directly. Instead:
- Use `korus-build-parent` which configures it automatically
- Or configure it in `annotationProcessorPaths`

## Content
This module will contain:
- Annotation processing implementation
- Dependency graph analysis
- Metadata generation
- Build-time validation
- Error reporting

## Design Principles
- **Build-time isolation**: No runtime dependencies on this module
- **Tool-agnostic**: Works with Maven, Gradle, and IDEs
- **Incremental**: Supports incremental compilation
- **Discoverable**: Uses Java ServiceLoader mechanism

## Scope Separation
Critical architectural boundary:
- **This module**: Build-time processing and metadata generation
- **context module**: Runtime that consumes generated metadata
