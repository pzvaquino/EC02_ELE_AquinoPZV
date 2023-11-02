/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Singer {
    //required fields below, string int and double
    static String name;
    static int noOfPerformances;
    static double earnings;
    static Song favoriteSong;
    
    //extra fields below
    static String venue;
    static String favoriteSongTitle;
    
    //required methods below
    void performForAudience(int people, Venue place) {
        noOfPerformances = noOfPerformances + 1;
        earnings = earnings + (100 * people);
        venue = place.place;
    }
    
    void changeFavSong(Song a) {
        favoriteSong = a;
        favoriteSongTitle = favoriteSong.title;
    }
    
    //constructors below
    public Singer(String singerName, Song favSong) {
        name = singerName;
        favoriteSong = favSong;
        favoriteSongTitle = favoriteSong.title;
    }
    public Singer(int Pop, Venue Place) {
        performForAudience(Pop, Place);
    }
    public Singer(Song newFavSong) {
        changeFavSong(newFavSong);
    }
}

