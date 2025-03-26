/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package duke.choice;

import java.util.ArrayList;
import java.util.List;

/**
 * ShopApp - Classe principal para demonstrar o uso de orientação a objetos
 * e cálculos simples de custo.
 */
public class ShopApp {

    public static void main(String[] args) {

        double tax = 0.2; // Taxa de imposto
        double total = 0.0; // Total da compra

        System.out.println("🛒 Welcome to ShopApp!");

        // Criando algumas peças de roupa
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Black Hat", 12.5, "M");
        Clothing item4 = new Clothing("White Socks", 5.0, "S");

        // Usando ArrayList para armazenar as roupas
        List<Clothing> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        // Criando um cliente com base na medição
        Customer c1 = new Customer("Pinky", 3); // Tamanho S
        System.out.println("👤 Cliente: " + c1.getName() + " (Size: " + c1.getSize() + ")");

        // Adicionando as roupas ao cliente
        c1.addItems(items);

        // Exibindo o total com imposto
        System.out.println("Total (com imposto): R$ " + c1.getTotalClothingCost());

        // Imprimindo as descrições dos itens do cliente
        for (Clothing item : c1.getItems()) {
            System.out.println("Itens: " + item.getDescription());
        }
    }
}
