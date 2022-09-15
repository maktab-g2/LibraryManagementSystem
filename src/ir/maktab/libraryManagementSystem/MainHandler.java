package ir.maktab.libraryManagementSystem;

import ir.maktab.libraryManagementSystem.data.model.entity.Staff;
import ir.maktab.libraryManagementSystem.data.model.entity.Student;
import ir.maktab.libraryManagementSystem.data.model.entity.User;
import ir.maktab.libraryManagementSystem.service.AccountService;
import ir.maktab.libraryManagementSystem.service.LibrarianService;

import java.util.Scanner;

public class MainHandler {
    public static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        AccountService accountService = new AccountService();
        LibrarianService librarianService = new LibrarianService();
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("<------------- menu ------------->" +
                    "\n 1- login" +
                    "\n 2- register" +
                    "\n 3- log out");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("enter your username : ");
                    String username = scanner.nextLine();
                    System.out.println("enter your password : ");
                    String password = scanner.nextLine();
                    User user = accountService.logIn(username, password);
                    if (user == null)
                        System.out.println("username or password is wrong");
                    else {
                        System.out.println("<------------- welcome ------------->" +
                                "\n 1- BorrowedBooks" +
                                "\n 2- ReservedBooks" +
                                "\n 3- ReturnBooks" +
                                "\n 4- LostBooks" +
                                "\n 5- ShowFineAmount" +
                                "\n 6- log out");
                        switch (Integer.parseInt(scanner.nextLine())) {
                            case 1:
                                System.out.println("enter the book title : ");
                                if (librarianService.borrowedBook(scanner.nextLine(), user))
                                    System.out.println("done");
                                break;
                            case 2:

                                break;
                            case 3:
                                System.out.println("enter the book title : ");
                                if (librarianService.ReturnBooks(scanner.nextLine(), user))
                                    System.out.println("done");
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            default:
                                break;
                        }
                    }
                    answer = choseContinueOrNot();
                    break;
                case 2:
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
                            System.out.println("enter a true value");
                            break;
                    }
                    answer = choseContinueOrNot();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("enter a true value");
                    break;
            }
        }
    }

    public String choseContinueOrNot() {
        System.out.println("Do you want continue ? (y|n)");
        return scanner.nextLine();
    }
}
