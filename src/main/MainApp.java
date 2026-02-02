package main;

import dao.addStudent;
import dao.deleteStudent;
import dao.updateStudent;
import dao.viewStudent;

import java.util.Scanner;

public class MainApp {
    Scanner sc = new Scanner(System.in);
    addStudent a= new addStudent();
    deleteStudent d= new deleteStudent();
    updateStudent u= new updateStudent();
    viewStudent v=new viewStudent();

System.out.println("1.Add 2.View 3.Update 4.Delete");
    int choice = sc.nextInt();

switch (choice) {
        case 1:
            a.addStudent(new addStudent(1, "Nandan", "nandan@gmail.com"));
            break;
        case 2:
            v.viewStudents();
            break;
        case 3:
            u.updateStudent(1,"krishna");
            break;
        case 4:
            d.deleteStudent(1);
    }

}
