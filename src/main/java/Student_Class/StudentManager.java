/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Class;

import java.util.Collection; //---Ho tro xu ly Collection
import java.util.List; 
import java.util.Scanner; //---Ho tro nhap gia tri tu ban phim
        
/**
 *
 * @author vomin
 */
public class StudentManager {
    //---static
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> List_Students; //--- Bien luu du lieu
    private StudentFile studentFile; //---Doc file
    //---Constructor
    public StudentManager(){
        studentFile = new StudentFile();
        List_Students = studentFile.readDataFromFile();
    }
    //---Function
    public void add(){
        int id = (List_Students.size()>0) ?  (List_Students.size()+1) : 0;
        System.out.println("ID sinh vien la: "+id);
        //---Nhap thong tin sinh vien
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int age =Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());
        //---Tao sinh vien moi
        Student new_student= new Student(name,id,address,age,gpa);
    }
}
