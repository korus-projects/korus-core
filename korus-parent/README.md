# Korus Parent

## Purpose
Parent POM for **all internal Korus framework modules**. This module provides:

- Build plugin configuration and management
- Common build properties (Java version, encoding, etc.)
- Source and Javadoc JAR generation
- Flatten plugin for CI-friendly versions
- Automatic BOM import for dependency management

## Usage
Internal framework modules should declare this as their parent:

```xml
<parent>
    <groupId>io.korus</groupId>
    <artifactId>korus-parent</artifactId>
    <version>${revision}</version>
    <relativePath>../korus-parent</relativePath>
</parent>
```

## Scope
**Framework modules only** - Not intended for user applications.

For user applications, see `korus-build-parent`.
