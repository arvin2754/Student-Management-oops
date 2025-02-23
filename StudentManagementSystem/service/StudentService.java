package StudentManagementSystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import StudentManagementSystem.entity.Student;

public class StudentService {
    List<Student> students = new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter student id : ");
        int id = sc.nextInt();
        System.out.println("");

        System.out.print("Enter Student name : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("");

        System.out.print("Enter student age :  ");
        int age = sc.nextInt();
        System.out.println("");

        System.out.print("Enter student course : ");
        sc.nextLine();
        String course = sc.nextLine();
        System.out.println("");

        students.add(new Student(id, name, age, course));
        System.out.println("Student added successfully");
        System.out.println("");
    }

    public void showStudents() {
        if (students.size() == 0) {
            System.out.println("no student list is found");
            System.out.println("");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("");
    }

    public void updateStudent() {
        System.out.print("Enter id to update : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter Student name : ");
                student.setName(sc.nextLine());
                System.out.println("");

                System.out.print("Enter student age : ");
                student.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("");

                System.out.print("Enter student course : ");
                student.setCourse(sc.nextLine());
                System.out.println("");

                System.out.println("Student details updated Successfully");
                System.out.println("");
                return;
            }
        }
    }

    public void deleteStudent() {
        System.out.print("Enter id to delete : ");
        int id = sc.nextInt();
        System.out.println("");

        students.remove(id == 0 ? id : id - 1);
        System.out.println("Student deleted Successfully");
        System.out.println("");
    }

    public void studentbyRollNumber() {
        System.out.print("Enter Student id : ");
        int id = sc.nextInt();
        System.out.println("");

        for (Student student : students) {
            if (student.getId() == id) {
                student.displayStudent();
                System.out.println("");
                return;
            }
        }
        System.out.println("no student found");
        System.out.println("");
    }

}
