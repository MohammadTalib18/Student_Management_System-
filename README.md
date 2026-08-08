<title>Student Management System</title>

A console-based Student Management System built using Core Java and File Handling. The application allows users to add, view, search, update, and delete student records. All student data is stored in a text file instead of a database.<br>

📌 <h1>Project Overview</h1>

This project demonstrates how Java File Handling can be used to create a simple record management system.

The application provides a menu-driven interface where users can perform CRUD operations on student records.

                  Main.java
                     |
                     ↓
              StudentManager
                     |
       ------------------------------
       |       |       |       |      |
      Add     View   Search  Update  Delete
       |       |       |       |      |
       --------------------------------
                     |
                     ↓
                students.txt
✨ <h1> Features</h1> 
➕ Add Student<br>
📋 View All Students<br>
🔍 Search Student by ID<br>
✏️ Update Student<br>
🗑️ Delete Student<br>
💾 Store records in a text file<br>
📂 File-based data storage<br>
⚠️ Exception handling<br>
🖥️ Menu-driven console interface<br>
🔄 Complete CRUD operations<br>

🛠️<h1>Technologies Used</h1>
Java
Core Java<br>
File Handling<br>
OOP<br>
Exception Handling<br>
Java I/O<br>
Scanner


📂<h1> Project Structure</h1>
Student-Management-System/
│
├── src/
│   ├── Main.java
│   ├── Student.java
│   └── StudentManager.java
│
├── students.txt
│
└── README.md


Represents a student object.

It contains:

Student ID<br>
Student name<br>
Course<br>
Marks<br>
Constructor<br>
Getters and setters<br>
toString() method<br>
StudentManager.java<br>

Contains the main file-handling operations:

Add student<br>
View students<br>
Search student<br>
Update student<br>
Delete student<br>
students.txt<br>

Stores student records permanently.

Example:

101,Mohammad Talib,CSE,85.0
102,Rahul Kumar,IT,78.0
103,Aman Singh,CSE,91.0

🔄 CRUD Operations

The project implements:

Operation	Description
Create	Add a new student
Read	View and search student records
Update	Modify existing student information
Delete	Remove a student record
📚 File Handling Concepts Used

This project covers several important Java File Handling concepts:

File
FileReader
FileWriter
BufferedReader
BufferedWriter
IOException
createNewFile()
read()
readLine()
write()
append
delete()
try-with-resources
▶️ How to Run
1. Clone the Repository
git clone https://github.com/your-username/Student-Management-System.git
2. Open the Project

Open the project in:

IntelliJ IDEA
Eclipse
NetBeans
VS Code
3. Compile the Java Files
javac src/*.java
4. Run the Application
java -cp src Main
💻 Example Run
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter choice: 1

Enter ID: 101
Enter Name: Mohammad Talib
Enter Course: CSE
Enter Marks: 85

Student added successfully.

After adding the student, the students.txt file contains:

101,Mohammad Talib,CSE,85.0
🔍 Search Example
Enter Student ID: 101

Student Found
ID: 101
Name: Mohammad Talib
Course: CSE
Marks: 85.0
📝 Update Example
Enter Student ID: 101
Enter New Name: Mohammad Talib
Enter New Course: CSE
Enter New Marks: 90

Student updated successfully.
🗑️ Delete Example
Enter Student ID: 101

Student deleted successfully.
🎯 Learning Objectives

Through this project, I learned and practiced:

Java File Handling
Reading and writing files
Buffered streams
File-based CRUD operations
Object-Oriented Programming
Exception Handling
Constructors
Getter and Setter methods
String manipulation
try-with-resources
Working with Git and GitHub
🚀 Future Improvements

The project can be further improved by adding:

GUI using Java Swing
MySQL database integration
Login and authentication
Student attendance management
Grade calculation
Sorting and filtering
Export records to CSV/PDF
Spring Boot REST API
👨‍💻 Author

Mohammad Talib

B.Tech Computer Science Engineering

Interested in Java Development, Spring Boot, SQL and Backend Development.

⭐ If you found this project useful, consider giving the repository a star!
