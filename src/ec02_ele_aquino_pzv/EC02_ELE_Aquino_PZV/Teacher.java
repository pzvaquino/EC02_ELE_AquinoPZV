/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

import java.util.ArrayList;

public class Teacher {
//Fields
    private String name;
    private String subject;
    private ArrayList<Section> sections = new ArrayList<>();
    
//Methods
    
    void giveAssignment(Assignment assignmentToGive) {
        sections.forEach((a) -> {
            ArrayList<Student> studentList = a.getStudentList();
            studentList.forEach((b) -> {
                b.addAssignment(assignmentToGive);
            });
        });
    }
    
//Getters
    
    String getName(){
        return name;
    }
    
    String getSubject(){
        return subject;
    }
    
    ArrayList getSectionList() {
        return sections;
    }
    
//Setters
    
    void setName(String newName){
        name = newName;
    }
    
    void setSubject(String newSubject){
        subject = newSubject;
    }
    
    void addSection(Section a){
        sections.add(a);
    }
    
    void removeSection(Section a){
        sections.remove(a);
    }
    
//Constructors
    
    Teacher(String teacherName) {
        name = teacherName;
    }
    
    Teacher(String teacherName, String subjectName) {
        name = teacherName;
        subject = subjectName;
    }
}
