package duke.choice;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Customer representa um cliente que possui roupas.
 * Ela armazena as roupas e calcula o custo total com base no tamanho do cliente.
 */
public class Customer {
    private String name;
    private String size;
    private List<Clothing> items;  // Usando List em vez de array fixo

    // Construtor para inicializar o nome do cliente e calcular o tamanho baseado em uma medição
    public Customer(String name, int measurement) {
        this.name = name;
        setSizeFromMeasurement(measurement);  // Define o tamanho com base na medição
        items = new ArrayList<>();  // Inicializa a lista de itens
    }

    // Método para definir o tamanho com base em uma medição simulada
    private void setSizeFromMeasurement(int measurement) {
        if (measurement >= 1 && measurement <= 3) {
            this.size = "S";
        } else if (measurement >= 4 && measurement <= 6) {
            this.size = "M";
        } else if (measurement >= 7 && measurement <= 9) {
            this.size = "L";
        } else {
            this.size = "X";
        }
    }

    // Método para adicionar itens ao cliente
    public void addItems(List<Clothing> someItems) {
        items = someItems;
    }

    // Getter para os itens
    public List<Clothing> getItems() {
        return items;
    }

    // Método que calcula o custo total das roupas que combinam com o tamanho do cliente
    public double getTotalClothingCost() {
        double total = 0.0;
        double tax = 0.2;

        // Percorre os itens e soma os preços das roupas compatíveis com o tamanho
        for (Clothing item : items) {
            if (this.size.equals(item.getSize())) {
                total += item.getPrice();
                System.out.println("item = " + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
            }
        }

        // Aplica o imposto e retorna o total
        return total * (1 + tax); 
    }

    // Getter para o nome do cliente
    public String getName() {
        return name;
    }

    // Getter para o tamanho do cliente
    public String getSize() {
        return size;
    }
}
