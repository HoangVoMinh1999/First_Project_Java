/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Class;
import java.io.Serializable;
/**
 *
 * @author vomin
 */
public class Student implements Serializable {
    
    public static String school = "HCMUS";
    
    private String name;
    private int id;
    private String address;
    private int age;
    private float gpa;
    //---Constructor
    public Student(){
    }
    
    public Student(String name, int id, String address, int age, float gpa){
        this.name=name;
        this.address=address;
        this.age=age;
        this.gpa=gpa;
        this.id=id;
    }
    //---Getter vs Setter
    //---name
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    //---Address
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    //---Age
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    //---GPA
    public float getGPA(){
        return this.gpa=gpa;
    }
    public void setGPA(float gpa){
        this.gpa=gpa;
    }
    //---ID
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id=id;
    }
}
