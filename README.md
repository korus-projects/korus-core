# Korus Framework

[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)]()
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](LICENSE)
[![Java Version](https://img.shields.io/badge/java-25%2B-orange.svg)]()


A modern, high-performance dependency injection framework for Java.


### Build the Project

```bash
mvn clean install
```

### Run Test Application

```bash
mvn exec:java -pl test-app
```

### Run Tests

```bash
mvn test
```

## For Contributors

### Adding a New Module

1. Create module directory
2. Use `korus-parent` as parent
3. Add to `bom/pom.xml`
4. Add to root `pom.xml` reactor
5. Create module README
6. Update documentation

### Development Workflow

```bash
# Build everything
mvn clean install

# Build specific module
mvn clean install -pl <module-name>

# Run validation
./validate-architecture.sh

# Check dependencies
mvn dependency:tree -pl <module-name>
```

## Requirements
- **Java**: 25 or higher
- **Maven**: 3.8.0 or higher
- **Build Tool**: Maven

## Contributing
Contributions are welcome! Please read our contributing guidelines (coming soon).

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.

---

**Made with ❤️ for the Java community**
