🎓 Student Management System

A console-based Student Management System built using Core Java and File Handling. The application allows users to add, view, search, update, and delete student records. All student data is stored in a text file instead of a database.

📌 Project Overview

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
✨ Features
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

🛠️ Technologies Used
Java
Core Java<br>
File Handling<br>
OOP<br>
Exception Handling<br>
Java I/O<br>
Scanner


📂 Project Structure
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


📄 Project Files
Main.java

Contains the main method and menu-driven interface.

It takes input from the user and performs the selected operation.

Student.java

Contains the student model/class.

It includes:

Student ID<br>
Student Name<br>
Course<br>
Marks<br>
Constructor<br>
Getter and Setter methods<br>
toString() method<br>
StudentManager.java<br>

Handles all major student operations:

Add<br>
View<br>
Search<br>
Update<br>
Delete<br>

It also handles reading and writing student records using Java File Handling.

students.txt

Stores student records.

Example:

101,Mohammad Talib,CSE,85.0<br>
102,Rahul Kumar,IT,78.0<br>
103,Aman Singh,CSE,91.0<br>

🔄 CRUD Operations

The project implements:

Operation	Description<br>
Create	Add a new student<br>
Read	View and search student records<br>
Update	Modify existing student information<br>
Delete	Remove a student record<br>


📚 File Handling Concepts Used

This project covers several important Java File Handling concepts:

File<br>
FileReader<br>
FileWriter<br>
BufferedReader<br>
BufferedWriter<br>
IOException<br>
createNewFile()<br>
read()<br>
readLine()<br>
write()<br>
append<br>
delete()<br>
try-with-resources<br>

▶️ How to Run
1. Clone the Repository
git clone https://github.com/your-username/Student-Management-System.git
2. Open the Project

Open the project in:

IntelliJ IDEA<br>
Eclipse<br>
NetBeans<br>
VS Code<br>
3. Compile the Java Files
javac src/*.java<br>
4. Run the Application
java -cp src Main<br>

💻 Example Run
===== STUDENT MANAGEMENT SYSTEM =====

1. Add Student<br>
2. View Students<br>
3. Search Student<br>
4. Update Student<br>
5. Delete Student<br>
6. Exit<br>

Enter choice: 1<br>

Enter ID: 101<br>
Enter Name: Mohammad Talib<br>
Enter Course: CSE<br>
Enter Marks: 85<br>

Student added successfully.

After adding the student, the students.txt file contains:

101,Mohammad Talib,CSE,85.0

Through this project, I learned and practiced:

Java File Handling<br>
Reading and writing files<br>
Buffered streams<br>
File-based CRUD operations<br>
Object-Oriented Programming<br>
Exception Handling<br>
Constructors<br>
Getter and Setter methods<br>
String manipulation<br>
try-with-resources<br>

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
