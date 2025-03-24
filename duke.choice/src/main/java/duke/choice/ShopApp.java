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
        System.out.println("Hello World!");
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        item2.description = "Orange Jacket";
        item2.price = 10.5;
        item2.size = "S";
        System.out.println("item1 = " + item1.description + "," + item1.price + "," + item1.size);
        System.out.println("item2 = " + item2.description + "," + item2.price + "," + item2.size);

    }
}
