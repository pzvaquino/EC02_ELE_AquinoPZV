/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

import java.util.ArrayList;

public class Student {
//Fields
    private String name;
    private ArrayList<Assignment> assignments = new ArrayList<>();
    
//Methods
    
    double getTimeNeeded() {
        //Is it a getter or a method? It gets a value derived from the fields, it doesn't get the fields themselves
        double x = 0;
        for(Assignment a : assignments) {
            x += a.getTimeAllotted();
        }
        return x;
    }
    
//Getters
    
    String getName() {
        return name;
    }
    
    ArrayList getAssignmentList(){
        return assignments;
    }
    
//Setters
    
    void setName(String newName) {
        name = newName;
    }
    
    void addAssignment(Assignment a) {
        assignments.add(a);
    }
    
    void finishAssignment(Assignment a) {
        assignments.remove(a);
    }
    
//Constructor
    
    Student(String studentName) {
        name = studentName;
    }
}
