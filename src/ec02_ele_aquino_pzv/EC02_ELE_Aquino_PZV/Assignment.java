/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Assignment {
//Fields
    private String name;
    private double timeAllotted;
    
//Getters
    
    String getName(){
        return name;
    }
    
    double getTimeAllotted(){
        return timeAllotted;
    }
    
//Setters
    
    void setName(String newName) {
        name = newName;
    }
    
    void setTimeAllotted(double newReqTime){
        timeAllotted = newReqTime;
    }
    
//Constructor
    
    Assignment(String reqName) {
        name = reqName;
    }
    
    Assignment(String reqName, double reqTime) {
        name = reqName;
        timeAllotted = reqTime;
    }
}
