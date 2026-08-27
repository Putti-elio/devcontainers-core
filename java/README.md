# Java template

JDK 21, a project-owned Maven Wrapper, JUnit 5, and Spotless. The pinned base
image contains no template-installed Maven or Gradle.

```sh
./mvnw spotless:check
./mvnw test
```

Run the sample with `./mvnw package` then `java -cp target/java-template-0.1.0.jar com.example.App`.
Use the Java debugger extension to launch `com.example.App`; no container
privileges are required. The wrapper verifies the Maven distribution SHA-512
before extracting it.

Use `make format`, `make lint`, `make test`, `make build`, `make debug`,
`make clean`, or `make distclean`.
