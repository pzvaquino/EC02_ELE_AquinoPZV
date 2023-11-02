/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
        this.name = name;
        earnings = 0;
        itemList = new ArrayList<>();
        storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if(index < itemList.size()) {
        earnings = earnings + itemList.get(index).getCost();
        System.out.println(this.getName() + " sold you " + itemList.get(index).getName() + ".\nEarnings: " + earnings + "\n");
    } else {
        System.out.println("Sale Failed.\nThere are only " + itemList.size() + " items in " + this.getName() + ". #" + index + " does not exist. \n");
    }
  }
  public void sellItem(String name){
    int i = 0;
    for(Item a : itemList) {
        i++;
        if(a.getName() == name){
            earnings = earnings + a.getCost();
            System.out.println(this.getName() + " sold you " + a.getName() + ".\nEarnings: " + earnings + "\n");
            break;
        } else if(i >= itemList.size()) {
            System.out.println("Sale Failed.\n" + this.getName() + " does not sell " + name + ".\n");
        }
    }
  }
  public void sellItem(Item i){
    if(itemList.contains(i)){
        earnings = earnings + i.getCost();
        System.out.println(this.getName() + " sold you " + i.getName() + ".\nEarnings: " + earnings + "\n");
    } else {
        System.out.println("Sale Failed.\n" + this.getName() + " does not sell " + i.getName() + ".\n");
    }
  }
  public void addItem(Item i){
      itemList.add(i);
  }
  public void filterType(String type){
      System.out.println("Items with the " + type + " tag.");
      for(Item a : itemList) {
          if(a.getType() == type) {
              System.out.println(a.getName());
          }
      }
      System.out.println();
  }
  public void filterCheap(double maxCost){
      System.out.println("Items with a cost lower than or equal to " + maxCost + ": ");
      for(Item a : itemList) {
          if(a.getCost() <= maxCost) {
              System.out.println(a.getName());
          }
      }
      System.out.println();
  }
  public void filterExpensive(double minCost){
      System.out.println("Items with a cost higher than or equal to " + minCost + ": ");
      for(Item a : itemList) {
          if(a.getCost() >= minCost) {
              System.out.println(a.getName());
          }
      }
      System.out.println();
  }
  public static void printStats(){
        for(Store a : storeList) {
            System.out.println(a.getName() + ": " + a.getEarnings());
        }
    }
}