/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Student_Class.Student;
import Student_Class.StudentManager;
import Student_Class.SortByGPA;
import Student_Class.SortByName;
import Student_Class.StudentFile;
import java.util.Scanner;

/**
 *
 * @author vomin
 */
public class MainClass {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //---Variable
        StudentManager studentManager = new StudentManager();
        boolean isExisted = false;
        int id; //---ID cua sinh vien
        //---Main Function
        while (isExisted) {
            showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.showStudents();
                    break;
                case 2:
                    studentManager.add();
                    break;
                case 3:
                    System.out.print("Nhap id sinh vien can xoa: ");
                    id = scanner.nextInt();
                    studentManager.delete(id);
                    break;
                case 4:
                    System.out.print("Nhap id sinh vien can chinh sua: ");
                    id = scanner.nextInt();
                    studentManager.edit(id);
                    break;
                case 5:
                    studentManager.sortByName();
                    break;
                case 6:
                    studentManager.sortByGPA();
                    break;
                case 0:
                    isExisted = true;
                    break;
                default:
                    System.out.println("Please choose correct choice !!!");
            }
        }
    }
    public static void showMenu() {
        System.out.println("/---STUDENT MANAGER---/");
        System.out.println("1/-Hien thi danh sach sinh vien");
        System.out.println("2/-Them sinh vien");
        System.out.println("3/-Xoa sinh vien");
        System.out.println("4/-Chinh sua thong tin sinh vien");
        System.out.println("5/-Sap xep danh sach sinh vien theo ten");
        System.out.println("6/-Sap xep danh sach sinh vien theo GPA");
        System.out.println("0/-Exit");
        System.out.println("/--------/");
        System.out.print("Nhap lua chon cua ban: ");
    }
}
