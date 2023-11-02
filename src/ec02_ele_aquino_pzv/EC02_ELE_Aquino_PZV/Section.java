/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

import java.util.ArrayList;

public class Section {
//Fields
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    
//Getters
    
    String getName(){
        return name;
    }
        
    ArrayList getStudentList() {
        return students;
    }
    
//Setters
    
    void setName(String newName) {
        name = newName;
    }
    
    void addStudent(Student a) {
        students.add(a);
    }
    
    void removeStudent(Student a){
        students.remove(a);
    }
    
//Constructor
    Section(String sectionName) {
        name = sectionName;
    }
}