## 📄 Description – Exercise Statement

### ✅ Exercise 1
This Java exercise introduces the use of a custom annotation `@JsonSerializable` to specify a directory for JSON serialization.

- The annotation `@JsonSerializable` takes a `directory` parameter indicating where to output the JSON file.
- The `JsonSerializer` utility uses Jackson's `ObjectMapper` and reflection to serialize annotated classes.
- Example model class: `Person`.
- The `Main` class demonstrates creating a `Person` and serializing it to JSON.

This exercise focuses on:
- Creating and using custom annotations
- Reflection in Java
- Integrating Jackson for JSON serialization

---

## 💻 Technologies Used

- Java 21
- Maven
- Jackson (com.fasterxml.jackson.core:jackson-databind)
- IntelliJ IDEA (or any Java IDE)
- Git & GitHub (optional, for version control)

---

## 📋 Requirements

- Java SDK21 or higher
- Maven installed
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/alaw810/1.7-JavaLanguage-Annotations-Level2.git
   ```

2. Open the project in your IDE:

   File → Open → Select the project folder

3. Set Java SDK to version 21+:

   File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Compile the project:

   ```bash
   mvn compile
   ```

2. Run the `Main` class:

   ```bash
   mvn exec:java
   ```

   You should see:

   ```
   Serialization completed successfully!
   ```

---

## 🌐 Deployment

This is a Java console-based educational exercise and doesn't require production deployment.
To build a JAR and run manually:

```bash
mvn package
java -jar target/json-serializer-1.0.0-SNAPSHOT.jar
```

---

## 🤝 Contributions

This exercise is intended for learning. However, pull requests with enhancements are welcome:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit and push your changes
4. Open a Pull Request

---

