/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Main {
    public static void main(String[] args) {
        Song none = new Song("N/A");
        Song sOne = new Song("Tree");
        Song sTwo = new Song("Apple");
        Venue vOne = new Venue("Street");
        Venue vTwo = new Venue("Stage");
        Singer a = new Singer("Adam", sOne);
        Singer b = new Singer("Eve", sTwo);

        a.performForAudience(sOne, 20, vOne);
        b.performForAudience(sTwo, 56, vTwo);
        a.performForAudience(sOne, 12, vOne);
        a.performForAudience(b, sTwo, 100, vOne);
        
        System.out.println("Singer 1:");
        System.out.println("    Name: " + a.getName());
        System.out.println("    Song: " + a.getFavSong());
        System.out.println("    Earnings: " + a.getEarnings());
        System.out.println("    Performances: " + a.getSingerPerformances());
        System.out.println();
        
        System.out.println("Singer 2:");
        System.out.println("    Name: " + b.getName());
        System.out.println("    Song: " + b.getFavSong());
        System.out.println("    Earnings: " + b.getEarnings());
        System.out.println("    Performances: " + b.getSingerPerformances());
        System.out.println();
        
        System.out.println("Total Combined Performances");
        System.out.println("    " + b.getTotalPerformances());
        System.out.println();
        
        System.out.println("Note: Collaborations are counted as 1 performance, that's why there's 4, not 5. All class fields are private, Singer has accessors, getters, and setters, while Song and Venue only has getters. All methods are public.");
        System.out.println();
    }
}

