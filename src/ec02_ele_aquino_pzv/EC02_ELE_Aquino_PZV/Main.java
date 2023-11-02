/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ec02_ele_aquino_pzv.EC02_ELE_Aquino_PZV;

public class Main {
    public static void main(String[] args) {
        Constructor granTurismo = new Constructor("Gran Turismo", "Polyphony Digital", 10850000, 1997);
        Constructor ffvii = new Constructor("Final Fantasy VII", "Square", 10022228, 1997);
        Constructor tekken = new Constructor("Tekken 3", "Namco", 8300000, 1999);

        System.out.println("-- Object 1 --\nName: " + granTurismo.name + "\nDeveloper: " + granTurismo.dev); System.out.printf("Sales: %.0f", granTurismo.sales); System.out.println("\nYear of Release: " + granTurismo.year + "\n\n");
        System.out.println("-- Object 2 --\nName: " + ffvii.name + "\nDeveloper: " + ffvii.dev); System.out.printf("Sales: %.0f", ffvii.sales); System.out.println("\nYear of Release: " + ffvii.year + "\n");
        System.out.println("-- Object 3 --\nName: " + tekken.name + "\nDeveloper: " + tekken.dev); System.out.printf("Sales: %.0f", tekken.sales); System.out.println("\nYear of Release: " + tekken.year + "\n");

        System.out.print("-- 3 or more Operations --\nSum of Gran Turismo sales and Final Fantasy 7 sales: "); Add(granTurismo.sales, ffvii.sales); System.out.print("\n");//Sum 
        System.out.print("How many more copies GT sold than Tekken did: "); Subtract(granTurismo.sales, tekken.sales); System.out.print("\n");//Difference
        System.out.print("Final Fantasy was released more recently than Tekken: "); More(ffvii.year, tekken.year); //More than
        System.out.print("Gran Turismo and Final Fantasy was released within the same year: "); Equal(granTurismo.year, ffvii.year); //Equal to
        System.out.print("\nNOTE: Three data types were used, double was printed without decimals with printf and %.0f\n");
    }
    
    public static void Add(double a, double b) {
        double sum = a + b;
        System.out.printf("%.0f",sum);
    }
    
    public static void Subtract(double a, double b) {
        double dif = a - b;
        System.out.printf("%.0f",dif);
    }
    
    public static void More(int a, int b) {
        Boolean c = a > b;
        System.out.println(c);
    }
    
    public static void Equal(int a, int b) {
        Boolean c = a == b;
        System.out.println(c);
    }
}