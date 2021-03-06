/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Class;

import java.util.Collections; //---Ho tro xu ly Collection
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

    public StudentManager() {
        studentFile = new StudentFile(); //---Doc file
        List_Students = studentFile.readDataFromFile(); //---Luu du lieu vao List_Students
    }

    //---Function
    public void add() {
        int id = (List_Students.size() > 0) ? (List_Students.size() + 1) : 0;
        System.out.println("ID sinh vien la: " + id);
        //---Nhap thong tin sinh vien
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());
        //---Tao sinh vien moi
        Student new_student = new Student(name, id, address, age, gpa);
        //---Them sinh vien vao mang
        List_Students.add(new_student);
        //---Ghi vao file
        studentFile.WriteDataToFile(List_Students);
    }

    public void edit(int id) {
        boolean isExisted=false;
        //---Nhap thong tin sinh vien
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap GPA: ");
        float gpa = Float.parseFloat(scanner.nextLine());
        for (int i = 0; i < List_Students.size(); i++) {
            if (List_Students.get(i).getID() == id) {
                isExisted = true;
                  List_Students.get(i).setName(name);
                  List_Students.get(i).setAddress(address);
                  List_Students.get(i).setAge(age);
                  List_Students.get(i).setGPA(gpa);
                  break;
            }
        }
        if (!isExisted){
            System.out.println("ID "+id+ "is not existed !!!");
        }
        else{
            studentFile.WriteDataToFile(List_Students);
        }
    }
    
    public void delete(int id){
        boolean isExisted=false;
        for (int i =0 ;i < List_Students.size();i++){
            if (List_Students.get(i).getID()==id){
                isExisted = true;
                List_Students.remove(id);
                break;  
            }
        }
        if (!isExisted){
            System.out.println(id+" is not existed !");
        }
        else{
            studentFile.WriteDataToFile(List_Students);
            System.out.println("Delete successfully !!!");
        }
    }
    
    public void showStudents(){
        System.out.println("Sinh vien truong: "+Student.school);
        for ( Student i : List_Students){
            System.out.println("----------------");
            System.out.println("ID: "+i.getID());
            System.out.println("Ten sinh vien: "+i.getName());
            System.out.println("Tuoi: "+i.getAge());
            System.out.println("Dia chi: "+i.getAddress());
            System.out.println("GPA: "+i.getGPA());
        }
    }
    
    public void sortByGPA(){
        Collections.sort(List_Students, new SortByGPA());
    }
    
    public void sortByName(){
        Collections.sort(List_Students, new SortByName());
    }
}
