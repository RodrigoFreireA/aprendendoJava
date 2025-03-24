/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package duke.choice;

/**
 *
 * @author Rodrigo
 */
public class ShopApp {

    public static void main(String[] args) {
        
        double tax = 0.2, total = 0.0;
        System.out.println("Hello World!");
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        System.out.println("item1 = " + item1.description + "," + item1.price + "," + item1.size);
        System.out.println("item2 = " + item2.description + "," + item2.price + "," + item2.size);
        //For this example, the user will buy 1 jacket and 2 T-shirts
        total = (item1.price + (item2.price *2)) * (1+tax);
        System.out.println("Total = " + total);
    }
}
