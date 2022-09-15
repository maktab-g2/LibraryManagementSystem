package ir.maktab.libraryManagementSystem;

import ir.maktab.libraryManagementSystem.data.model.entity.Staff;
import ir.maktab.libraryManagementSystem.data.model.entity.Student;

import java.util.Scanner;

public class MainHandler {
    public static Scanner scanner = new Scanner(System.in);

    public void showMenu() {

        System.out.println("<------------- menu ------------->" +
                "\n 1- login" +
                "\n 2- register" +
                "\n 3- log out");
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1:
                System.out.println("chose your level: \n 1- Student \n 2- Staff");
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        Student student = new Student();
                        System.out.println("enter your name : ");
                        student.setName(scanner.nextLine());
                        System.out.println("enter your classes : ");
                        student.setClasses(scanner.nextLine());
                        break;
                    case 2:
                        Staff staff = new Staff();
                        System.out.println("enter your name : ");
                        staff.setName(scanner.nextLine());
                        System.out.println("enter the dept : ");
                        staff.setDept(scanner.nextLine());
                        break;
                    default:
                        break;
                }
                break;
        }
    }
}
