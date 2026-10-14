# Q04-factorial: Find factorial

## Objective
Calculate n! for a non-negative integer.

## Files
- `pom.xml` — Maven build configuration and JUnit 5 dependency.
- `src/main/java/com/example/App.java` — Java program.
- `src/test/java/com/example/AppTest.java` — JUnit 5 tests.
- `Jenkinsfile` — Jenkins Declarative Pipeline to run `mvn clean verify` and publish JUnit results.

## Run locally
Open a terminal in this folder and run:

```bash
mvn clean verify
```

To run only the Java program after compiling, run:

```bash
mvn -q -DskipTests package
java -cp target/classes com.example.App
```

## Expected sample output
Run the `App` class; it prints a sample result for this exercise. Test expectations are in `AppTest.java`.

## Notes
This long-based implementation supports 0 through 20. 0! equals 1.
