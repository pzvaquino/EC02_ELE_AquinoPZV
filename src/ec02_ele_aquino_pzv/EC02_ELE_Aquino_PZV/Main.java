/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Main {
    public static void main(String[] args) {
        Assignment a1 = new Assignment("AA1", 2);
        Assignment a2 = new Assignment("AA2", 3);
        Assignment a3 = new Assignment("AA3", 5);
        
        Student s1 = new Student("Paul");
        Student s2 = new Student("Breindel");
        Student s3 = new Student("Kody");
        
        Section c1 = new Section("Electron");
        c1.addStudent(s1);
        c1.addStudent(s2);
        Section c2 = new Section("Muon");
        c2.addStudent(s3);
        
        Teacher t1 = new Teacher("Flip", "Computer Science");
        t1.addSection(c1);
        t1.addSection(c2);
        Teacher t2 = new Teacher("Ryan", "Music");
        t2.addSection(c2);
        Teacher t3 = new Teacher("Charles", "Social Science");
        t3.addSection(c1);
        
        t1.giveAssignment(a1);
        t2.giveAssignment(a2);
        t3.giveAssignment(a3);
        
        s2.finishAssignment(a1);
        
        System.out.printf("%s's remaining work: %.2f%n", s1.getName(), s1.getTimeNeeded());
        System.out.printf("%s's remaining work: %.2f%n", s2.getName(), s2.getTimeNeeded());
        System.out.printf("%s's remaining work: %.2f%n", s3.getName(), s3.getTimeNeeded());
    }
}
