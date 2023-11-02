/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Song {
    private String name;
    private int timesPlayed;
    
    public Song(String songName) {
        name = songName;
    }
    
    public void perform() {
        timesPlayed++;
    }
    
   //Getters
    public String getSongName() {
        return name;
    }
    
    public int getTimesPlayed() {
        return timesPlayed;
    }
}

