/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 * Classe Clothing representa uma peça de roupa.
 */
public class Clothing {
    private String description;
    private Double price;
    private String size;

    // Constantes de preço e taxa mínima (não usadas no cálculo final, mas existem para possíveis regras de negócio)
    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = .2;

    // Construtor para inicializar a peça de roupa com descrição, preço e tamanho
    public Clothing(String description, Double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
