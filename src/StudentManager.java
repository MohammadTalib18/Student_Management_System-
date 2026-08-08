import java.io.*;
import java.util.*;

public class StudentManager {

    private static final String FILE_NAME = "students.txt";

    // Add Student
    public void addStudent(Student student) {

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            writer.write(student.toString());
            writer.write("\n");

            System.out.println("Student added successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // View Students
    public void viewStudents() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No student records found.");
            return;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            System.out.println("\nID | Name | Course | Marks");
            System.out.println("--------------------------------");

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println(
                        data[0] + " | " +
                                data[1] + " | " +
                                data[2] + " | " +
                                data[3]
                );
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search Student
    public void searchStudent(int id) {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int studentId = Integer.parseInt(data[0]);

                if (studentId == id) {

                    System.out.println("\nStudent Found");
                    System.out.println("ID: " + data[0]);
                    System.out.println("Name: " + data[1]);
                    System.out.println("Course: " + data[2]);
                    System.out.println("Marks: " + data[3]);

                    return;
                }
            }

            System.out.println("Student not found.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Delete Student
    public void deleteStudent(int id) {

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        boolean found = false;

        try (
                BufferedReader reader =
                        new BufferedReader(new FileReader(inputFile));

                BufferedWriter writer =
                        new BufferedWriter(new FileWriter(tempFile))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int studentId = Integer.parseInt(data[0]);

                if (studentId == id) {
                    found = true;
                    continue;
                }

                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        if (found) {

            inputFile.delete();

            tempFile.renameTo(inputFile);

            System.out.println("Student deleted successfully.");

        } else {

            tempFile.delete();

            System.out.println("Student not found.");
        }
    }

    // Update Student
    public void updateStudent(
            int id,
            String name,
            String course,
            double marks) {

        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        boolean found = false;

        try (
                BufferedReader reader =
                        new BufferedReader(new FileReader(inputFile));

                BufferedWriter writer =
                        new BufferedWriter(new FileWriter(tempFile))
        ) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int studentId = Integer.parseInt(data[0]);

                if (studentId == id) {

                    writer.write(
                            id + "," +
                                    name + "," +
                                    course + "," +
                                    marks
                    );

                    found = true;

                } else {

                    writer.write(line);
                }

                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        if (found) {

            inputFile.delete();
            tempFile.renameTo(inputFile);

            System.out.println("Student updated successfully.");

        } else {

            tempFile.delete();

            System.out.println("Student not found.");
        }
    }
}