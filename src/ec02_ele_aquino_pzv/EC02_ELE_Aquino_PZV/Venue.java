/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Venue {
    private String name;
    private int timesUsed;
    
    public Venue(String venueName) {
        name = venueName;
    }
    
    public void perform() {
        timesUsed++;
    }
    
    public String getVenueName() {
        return name;
    }
    
    public int getTimesUsed() {
        return timesUsed;
    }
}

