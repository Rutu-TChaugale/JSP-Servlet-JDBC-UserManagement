
# 🎓 Student Management System - JSP/Servlet CRUD with MVC

![Java](https://img.shields.io/badge/Java-17-blue)
![JSP](https://img.shields.io/badge/JSP-2.3-yellow)
![Servlet](https://img.shields.io/badge/Servlet-4.0-orange)
![MVC](https://img.shields.io/badge/Architecture-MVC-brightgreen)
![JDBC](https://img.shields.io/badge/JDBC-Statement-red)

A full-stack **Student Management Web Application** built using **Java EE**, following the **MVC pattern**, with complete **login/registration and CRUD operations** for student records.

---

## 🚀 Features

✨ Simple, modular, and scalable structure  
🔐 User Authentication (Login / Registration)  
📋 Create, View, Edit, and Delete student records  
🗂️ Clean separation of concerns using MVC architecture  
💡 Easy to extend with PreparedStatement, DAO refactor, or hashing

---

## 🧠 Application Flow

```mermaid
graph TD
A[register.jsp] --> B[RegisterServlet]
B --> C[StudentServiceIMPL & StudentDaoIMPL]
C --> D[JDBC -> Database]
D --> E[success.jsp]

F[login.jsp] --> G[LoginServlet]
G --> H[validate user] --> I[list.jsp]

list.jsp --> J[Edit/Delete Actions] --> UpdateServlet/DeleteServlet
````

---

## 🗂️ Project Structure

```
src/
├── controller/
│   ├── LoginServlet.java
│   ├── RegisterServlet.java
│   ├── EditServlet.java
│   ├── UpdateServlet.java
│   └── DeleteServlet.java
├── dao/
│   ├── StudentDaoInterface.java
│   └── StudentDaoIMPL.java
├── model/
│   └── Student.java
├── service/
│   ├── StudentServiceInterface.java
│   └── StudentServiceIMPL.java
└── util/
    └── JDBCConnection.java

webapp/
├── login.jsp
├── register.jsp ✅
├── success.jsp ✅
├── list.jsp
├── edit.jsp
└── index.jsp
```

---

## 📝 JSP Page Descriptions

### 🔐 `register.jsp`

* Collects user/student data
* Sends form data to `RegisterServlet`
* Fields: Name, Email, Password, Department

```html
<form action="register" method="post">
  Name: <input type="text" name="name"><br>
  Email: <input type="email" name="email"><br>
  Password: <input type="password" name="password"><br>
  Department: <input type="text" name="department"><br>
  <input type="submit" value="Register">
</form>
```

---

### ✅ `success.jsp`

* Shown after successful registration
* Includes success message and link to login

```jsp
<h2>🎉 Registration Successful!</h2>
<p><a href="login.jsp">Click here to login</a></p>
```

---

## 🛠️ Setup Guide

### 📌 Prerequisites

* Java 8+
* Apache Tomcat 8.5+
* MySQL or compatible DB
* IDE like Eclipse or IntelliJ

### 🧱 Database Setup

```sql
CREATE DATABASE student_db;

CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100) UNIQUE,
  password VARCHAR(100),
  department VARCHAR(50)
);
```

### ⚙️ Configure JDBCConnection.java

```java
String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "your_password";
```

---

## 🧩 MVC Architecture

| Layer          | Responsibility                 | Examples                          |
| -------------- | ------------------------------ | --------------------------------- |
| **Model**      | Data objects and logic         | `Student.java`, `StudentDaoIMPL`  |
| **View**       | Frontend pages                 | `register.jsp`, `list.jsp`        |
| **Controller** | Handle requests and route data | `RegisterServlet`, `LoginServlet` |

---

## 🔐 Security Best Practices (Optional Enhancements)

* Replace `Statement` with `PreparedStatement`
* Add server-side form validation
* Hash passwords using `BCrypt` or similar libraries

---

## 🎯 Recommended Repository Name

**`Student-Management-JSP-Servlet-MVC`**

---

## 📝 License

MIT License – Free to use and modify for educational or personal projects.

---

## 👨‍💻 Author

Created with 💻 by Rutika Tanaji Chaugale

---

## 🙋 Want Help Extending This?

Would you like code snippets for `RegisterServlet.java` or `StudentDaoIMPL.java`? Just ask!

```

---

You can copy and paste this into your `README.md`. It’s styled for clarity, professionalism, and beginner-friendliness.

Would you like me to generate starter code for `RegisterServlet.java` or a DAO method?
```
