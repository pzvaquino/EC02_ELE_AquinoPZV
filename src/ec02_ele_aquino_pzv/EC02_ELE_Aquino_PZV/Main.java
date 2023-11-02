/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Initialize, create instance of 1 singer, 3 venues, and 2 songs---");
        
        Song trackOne = new Song("Hitchcock");
        Song trackTwo = new Song("Hibernation");
        
        Venue locationOne = new Venue("School");
        Venue locationTwo = new Venue("Park");
        Venue locationThree = new Venue("Street");
        
        Singer a = new Singer("Yorushika", trackOne);
        System.out.println("Name: " + a.name);
        System.out.println("Favorite Song: " + a.favoriteSongTitle);
        System.out.println("Current Venue: " + a.venue);
        System.out.println("No. of Performances: " + a.noOfPerformances);
        System.out.println("Earnings: " + a.earnings);
        
        System.out.println("---Singer performs in front of 12 in location 3---");
        
        a = new Singer(12, locationThree);
        System.out.println("Name: " + a.name);
        System.out.println("Favorite Song: " + a.favoriteSongTitle);
        System.out.println("Current Venue: " + a.venue);
        System.out.println("No. of Performances: " + a.noOfPerformances);
        System.out.println("Earnings: " + a.earnings);
        
        System.out.println("---Change favSong, perform in front of 20 in location 2---");
        
        a = new Singer(trackTwo);
        a = new Singer(20, locationTwo);
        System.out.println("Name: " + a.name);
        System.out.println("Favorite Song: " + a.favoriteSongTitle);
        System.out.println("Current Venue: " + a.venue);
        System.out.println("No. of Performances: " + a.noOfPerformances);
        System.out.println("Earnings: " + a.earnings);
        
        System.out.println("\n--Summary--\n  3 Classes\n    Song, Singer, and Venue\n  1 Custom class with three instances\n    Venue - School, Park, Street\n  Class 'Song' with a constructor and two instances\n    'Hitchcock' and 'Hibernation'\n  Class 'Singer' with one constructor and some fields and methods\n    3 Constructors, 2 Methods, and 2 extra fields (one for venue, one to 'convert' Song data type to String data type)\n\nMake Singer -> Assign Song and perform for 12 -> Change Song");
        System.out.println("\nAll classes have three types of data types. Song and Venue also has three, the fields just aren't assigned a value and displayed in the output or called upon in Main.java.");
    }
}

