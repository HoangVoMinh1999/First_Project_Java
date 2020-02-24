/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_Class;

import java.util.Comparator;

/**
 *
 * @author vomin
 */
import java.util.Comparator;
 
/**
 * SortStudentByGPA class
 * 
 * @author viettuts.vn
 */
public class SortByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGPA() > student2.getGPA()) {
            return 1;
        }
        return -1;
    }
}
