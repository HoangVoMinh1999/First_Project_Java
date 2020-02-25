/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Class;

import java.io.File;

import java.io.InputStream; // luong doc file
import java.io.OutputStream; // luong xuat file

import java.io.FileInputStream; // Ho tro doc file
import java.io.FileOutputStream; // Ho tro xuat file
import java.io.ObjectInputStream; // Ho tro doc du lieu
import java.io.ObjectOutputStream; // Ho tro xuat du lieu

import java.io.FileNotFoundException; // ERROR : khong tim dc file
import java.io.IOException; // ERROR : khong doc dc du lieu
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author vomin
 */
public class StudentFile {

    //---File Name
    public static String STUDENT_FILE_NAME = "Students.txt";

    //---Close
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //---Function Read data from file
    public List<Student> readDataFromFile() {
        List<Student> List_Students = new ArrayList<>(); // mang luu tru du lieu
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(STUDENT_FILE_NAME)); // mo file STUDENT_FILE_NAME
            ois = new ObjectInputStream(fis); // doc va luu du lieu cua STUDENT_FILE_NAME o ois
            List_Students = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return List_Students;
    }

    //---Function Write data to file
    public void WriteDataToFile(List<Student> List_Students) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(STUDENT_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(List_Students);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
}
