# PalindromeCheckerAppManagementSystem



## 📌 Objective
The objective of the **PalindromeChecker App** is to design and implement a
**console-based Java application** that validates whether a given string is a
palindrome under different conditions, while strengthening **core programming
fundamentals** and **data structure concepts**.

---

## 🚀 Use Case 1 (UC1): Application Entry & Welcome Message

### 🎯 Goal
Display a welcome message and application details at startup.

### 👤 Actor
User

### 🔄 Flow
1. Program starts.
2. JVM invokes the `main()` method.
3. Application name is displayed.
4. Application version is displayed.
5. Program continues to the next use case or exits.

---

## 🧠 Key Concepts Used in UC1

- **Class**  
  Acts as a container for the Palindrome Checker application logic.

- **Main Method**  
  Entry point of the Java application with the signature:  
  `public static void main(String[] args)`

- **Static Keyword**  
  Allows the JVM to invoke the `main()` method without creating an object.

- **Console Output**  
  `System.out.println()` is used to display messages on the console.

- **Application Flow Control**  
  Defines the startup behavior before palindrome processing begins.

---


---

## 🛠️ Technologies Used
- Java (JDK 8 or above)
- Console-based application
- 

---

## ▶️ How to Run the Application

1. Open a terminal or command prompt
2. Navigate to the project directory
3. Compile the program: javac PalindromeCheckerApp.java
4. Run the program: java PalindromeCheckerApp



---

## 📤 Sample Output
====================================
Welcome to Palindrome Checker Management System
Application Version : 1.0

System Initialized Successfully.

---

## 📈 Future Enhancements
- User input handling
- Palindrome checking logic
- Menu-driven interface
- Input validation
- Use of data structures for optimization

---

## 👩‍💻 Author
**Vasantha .R**

---

## 🏷️ Version
**1.0** – Application entry and welcome message (UC1)

---



---

## 🚀 Use Case 2 (UC2): Print a Hardcoded Palindrome Result

### 🎯 Goal
Display whether a hardcoded string is a palindrome.

### 👤 Actor
User

---

### 🔄 Flow
1. Program starts.
2. A hardcoded string is initialized.
3. The string is checked for palindrome logic.
4. The result is printed on the console.
5. Program exits.

---

## 🧠 Key Concepts Used in UC2

- **Class**  
  In Java, every program must be written inside a class.  
  The class acts as a container for program logic.

- **Main Method**  
  Entry point of the Java application with the signature:  
  `public static void main(String[] args)`

- **Static Keyword**  
  Allows the JVM to invoke the `main()` method without creating
  an object of the class.

- **String**  
  A built-in Java class used to store and manipulate textual data.
  Here, it stores the word to be checked for a palindrome.

- **String Literal**  
  Text enclosed within double quotes (e.g., `"madam"`),
  stored in the String Constant Pool.

- **Loop (for loop)**  
  Iterates only till half of the string length to compare characters
  from both ends.

- **Conditional Statement (if-else)**  
  Used to verify whether the string satisfies the palindrome condition.

- **Console Output**  
  `System.out.println()` is used to display the input and result.

---

## 🧩 Data Structure Used
- **String**

---
---

## 🚀 Use Case 3 (UC3): Palindrome Check Using String Reverse

### 🎯 Goal
Check whether a string is a palindrome by reversing it.

---

### 🔄 Flow
1. Reverse the string using a loop.
2. Compare the original string with the reversed string.
3. Display the result.
4. Program exits.

---

## 🧠 Key Concepts Used in UC3

- **Loop (for loop)**  
  Used to iterate through the characters of the string in reverse order
  to construct the reversed string.

- **String Immutability**  
  In Java, `String` objects are immutable.  
  Each modification creates a new `String` object in memory.

- **String Concatenation (+)**  
  Used to build the reversed string character by character.  
  This approach is intentionally used to demonstrate its drawbacks,
  which will be improved in later use cases.

- **equals() Method**  
  Used to compare the actual content of two `String` objects rather than
  memory references.

- **Console Output**  
  `System.out.println()` is used to display the input and result.

---

## 🧩 Data Structure Used
- **String**

---







