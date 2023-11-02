/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Singer {
    private String name;
    private Song favoriteSong;
    private double earnings;
    private int noOfPerformances;
    
    //Static
    private static int totalPerformances;
    
    //Constructor
    public Singer(String singerName, Song singerSong) {
        name = singerName;
        favoriteSong = singerSong;
    }
    
    public void performForAudience(Song songPerform, int noOfPeople, Venue venuePerform) {
        totalPerformances++;
        noOfPerformances++;
        earnings = earnings + (noOfPeople * 100);
        songPerform.perform();
        venuePerform.perform();
    }
    
    public void performForAudience(Singer collabSinger, Song songPerform, int noOfPeople, Venue venuePerform) {
        totalPerformances++;
        noOfPerformances++;
        collabSinger.noOfPerformances++;
        earnings = (earnings + (noOfPeople * 100))/2;
        collabSinger.earnings = (collabSinger.earnings + (noOfPeople * 100)/2);
        songPerform.perform();
        venuePerform.perform();
    }
    
    //Setters
    public void changeName(String newName) {
        name = newName;
    }
    
    public void changeFavSong(Song newFavSong) {
        favoriteSong = newFavSong;
    }
    
    //Getters
    public String getName() {
        return name;
    }
    
    public String getFavSong() {
        String a = favoriteSong.getSongName();
        return a;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public int getSingerPerformances() {
        return noOfPerformances;
    }
    
    public int getTotalPerformances() {
        return totalPerformances;
    }
}
