# Korus BOM (Bill of Materials)

## Purpose
Centralized dependency management for the entire Korus framework ecosystem. This module:

- Defines versions for ALL dependencies used by Korus
- Provides a single source of truth for dependency versions
- Ensures consistent dependency versions across modules

## Usage

### For Framework Modules
Framework modules automatically import this BOM through `korus-parent`.

### For User Applications
User applications can import this BOM directly:

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>io.korus</groupId>
            <artifactId>bom</artifactId>
            <version>1.0.0-SNAPSHOT</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
```

Or use `korus-build-parent` which imports it automatically.

## Principles
- **No transitive dependencies**: BOM only manages versions, doesn't impose dependencies
- **Clear separation**: Build-time vs runtime dependencies clearly scoped
