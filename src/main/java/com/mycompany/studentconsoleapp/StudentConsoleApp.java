package com.mycompany.studentconsoleapp;
import java.util.List;
import java.util.Scanner;
public class StudentConsoleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1 Insert Student");
            System.out.println("2 View All Students");
            System.out.println("3 Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); 
                    DatabaseManager.addStudent(new Student(name, email, age));
                    break;
                case 2:
                    List<Student> students = DatabaseManager.getAllStudents();
                    for (Student s : students) {
                        System.out.println("ID: " + s.getId() +
                                           " | Name: " + s.getName() +
                                           " | Email: " + s.getEmail() +
                                           " | Age: " + s.getAge());
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}
