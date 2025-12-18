# Korus Test Application

## Purpose
This module simulates a **real end-user application** built with the Korus framework. It serves multiple purposes:

1. **Architecture Validation**: Ensures the Maven dependency architecture works correctly
2. **User Example**: Demonstrates how users should structure their projects
3. **Integration Testing**: Tests the complete framework from a user's perspective
4. **Documentation**: Provides working examples for documentation

## Module Type
**End-User Test Application** - Not part of the framework, but uses it as a dependency.

## Setup

This module demonstrates the **recommended user setup**:

```xml
<parent>
    <groupId>io.korus</groupId>
    <artifactId>korus-build-parent</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</parent>

<dependencies>
    <!-- Single dependency for all Korus functionality -->
    <dependency>
        <groupId>io.korus</groupId>
        <artifactId>core-starter</artifactId>
    </dependency>

    <!-- User chooses logging implementation -->
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
    </dependency>
</dependencies>
```

## What This Validates

### Maven Architecture
- Parent POM inheritance works correctly
- BOM import through parent works
- Annotation processor is automatically configured
- All dependencies resolve correctly
- No version conflicts

### Build Setup
- Compilation succeeds
- Tests run successfully
- Application can be executed
- Logging works correctly

### User Experience
- Minimal POM configuration required
- No manual processor configuration needed
- Clean dependency management
- Standard Maven conventions

## Running the Application

### Build
```bash
mvn clean install
```

### Run
```bash
mvn exec:java -pl test-app
```

Or:
```bash
cd test-app
mvn exec:java
```

### Test
```bash
mvn test -pl test-app
```