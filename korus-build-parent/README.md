# Korus Build Parent

## Purpose
Parent POM for **user applications** built with Korus. This module provides:

- Build configuration suitable for applications
- Automatic annotation processor configuration
- Korus BOM import for dependency management
- Compiler settings optimized for Korus processing

## Usage
User applications should declare this as their parent:

```xml
<parent>
    <groupId>io.korus</groupId>
    <artifactId>korus-build-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</parent>
```

Then add dependencies from the Korus ecosystem:

```xml
<dependencies>
    <dependency>
        <groupId>io.korus</groupId>
        <artifactId>core-starter</artifactId>
    </dependency>
</dependencies>
```

## What It Provides
- **Automatic processor discovery**: No need to manually configure annotation processors
- **Dependency management**: All Korus versions managed through imported BOM
- **Build-time optimizations**: Incremental compilation support

## Scope
**User applications only** - Not for framework modules.
