package StudentManagementSystem;

import java.util.Scanner;

import StudentManagementSystem.service.StudentService;

class Main{

    public Main(){
        System.out.println("Welcome to Student Management System");
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService s = new StudentService();
        boolean running = true;
        while(running){
            System.out.println("Enter 1 : Show Students");
            System.out.println("Enter 2 : Add Student");
            System.out.println("Enter 3 : Update Student");
            System.out.println("Enter 4 : delete Student");
            System.out.println("Enter 5 : Show student by Roll Number");
            System.out.println("Enter 6  : Exit...");
            System.out.println("");
            System.out.print("Enter number : ");

            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    s.showStudents();
                    break;
                case 2:
                s.addStudent();
                break;

                case 3:
                s.updateStudent();
                break;

                case 4:
                s.deleteStudent();
                break;

                case 5:
                s.studentbyRollNumber();
                break;

                case 6:
                running=false;
                break;
            
                default:
                System.out.println("invalid choice");
                    break;
            }
        }
    }
}