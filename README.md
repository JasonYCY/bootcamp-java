# Java Practice Repository

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

A collection of Java programs and exercises for learning and practicing core programming concepts, data structures, algorithms, and modern Java features.

## 📋 Table of Contents

- [Overview](#overview)
- [Topics Covered](#topics-covered)
- [Getting Started](#getting-started)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [Learning Path](#learning-path)
- [Resources](#resources)
- [License](#license)

## 📖 Overview

This repository contains Java practice exercises ranging from basic syntax to advanced concepts. Each directory focuses on a specific topic with progressively challenging problems to build strong programming fundamentals.

## 🎯 Topics Covered

### 🟢 Beginner Level

- **Basic Syntax**: Variables, operators, control flow
- **Methods & Functions**: Parameter passing, return types
- **Arrays & Strings**: Manipulation and common operations
- **Exception Handling**: Try-catch blocks, custom exceptions

### 🟡 Intermediate Level

- **OOP Concepts**: Classes, objects, inheritance, polymorphism
- **Collections Framework**: Lists, Sets, Maps, Queues
- **File I/O**: Reading/writing files, serialization
- **Java 8+ Features**: Lambdas, Streams, Optional

### 🔴 Advanced Level

- **Multithreading**: Threads, synchronization, executors
- **Design Patterns**: Singleton, Factory, Observer, etc.
- **Data Structures**: Custom implementations
- **Algorithms**: Sorting, searching, recursion

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 11 or higher**
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)
- **Build Tool** (Maven or Gradle - optional)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/java-practice.git
   cd java-practice
   ```

2. **Set up your IDE**

   - Import as existing project
   - Configure JDK path
   - Set up project SDK

3. **Verify installation**
   ```bash
   java --version
   javac --version
   ```

## 🛠️ How to Use

### Running Individual Programs

```bash
# Navigate to the specific package
cd src/basics/hello-world

# Compile
javac HelloWorld.java

# Run
java HelloWorld
```

### Using an IDE

1. Open the project in your preferred IDE
2. Navigate to the desired Java file
3. Click "Run" or use the IDE's shortcut (usually Shift+F10)

### Running Tests

```bash
# If using Maven
mvn test

# If using JUnit directly
javac -cp .:junit.jar TestFile.java
java -cp .:junit.jar org.junit.runner.JUnitCore TestClass
```

## 🤝 Contributing

Want to add more practice problems or improve existing ones? Contributions are welcome!

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/amazing-practice`)
3. **Commit your changes** (`git commit -m 'Add some amazing practice'`)
4. **Push to the branch** (`git push origin feature/amazing-practice`)
5. **Open a Pull Request**

### Contribution Guidelines

- Follow Java naming conventions
- Add comments explaining complex logic
- Include sample input/output where applicable
- Write unit tests for new problems
- Keep solutions efficient and readable

## 📚 Learning Path

### Recommended Order

1. Start with `basics/` - Master fundamental syntax
2. Move to `oop/` - Understand object-oriented principles
3. Practice `collections/` - Learn standard data structures
4. Explore `streams/` - Modern Java functional programming
5. Tackle `algorithms/` - Problem-solving techniques
6. Advance to `multithreading/` - Concurrent programming
7. Study `patterns/` - Software design patterns

### Daily Practice Routine

1. Solve 1-2 problems from each topic weekly
2. Review and refactor old solutions
3. Time yourself on coding challenges
4. Compare solutions with different approaches

## 📖 Resources

### Documentation

- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java API Specification](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)

### Learning Platforms

- [LeetCode](https://leetcode.com/) - Coding challenges
- [HackerRank](https://www.hackerrank.com/) - Java practice
- [Exercism](https://exercism.org/tracks/java) - Mentored exercises

### Books

- "Effective Java" by Joshua Bloch
- "Head First Java" by Kathy Sierra & Bert Bates
- "Java: The Complete Reference" by Herbert Schildt

## 📊 Progress Tracking

Track your learning journey:

- [ ] Complete all basic syntax exercises
- [ ] Master OOP principles
- [ ] Implement all major data structures
- [ ] Solve 50+ algorithm problems
- [ ] Build a small project using learned concepts

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## ⭐ Support

If you find this repository helpful, please give it a star! It helps others discover it too.
