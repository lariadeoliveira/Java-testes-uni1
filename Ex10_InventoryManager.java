import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10_InventoryManager {

    private static Map<String, Product> stock = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option = "";

        System.out.println("=== Sistema de Gerenciamento de Estoque ===");

        while (!option.equals("5")) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Listar estoque");
            System.out.println("5 - Sair");

            option = sc.nextLine().trim();

            switch (option) {
                case "1":
                    addProduct(sc);
                    break;
                case "2":
                    removeProduct(sc);
                    break;
                case "3":
                    updateProduct(sc);
                    break;
                case "4":
                    showStock();
                    break;
                case "5":
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }

    private static void addProduct(Scanner sc) {
        System.out.print("Nome do produto: ");
        String name = sc.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Nome inválido!");
            return;
        }
        if (stock.containsKey(name)) {
            System.out.println("Produto já cadastrado!");
            return;
        }

        System.out.print("Quantidade: ");
        int qty = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Preço (R$): ");
        double price = Double.parseDouble(sc.nextLine().trim());

        stock.put(name, new Product(name, qty, price));
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void removeProduct(Scanner sc) {
        System.out.print("Nome do produto a remover: ");
        String name = sc.nextLine().trim();
        if (stock.remove(name) != null) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void updateProduct(Scanner sc) {
        System.out.print("Nome do produto a atualizar: ");
        String name = sc.nextLine().trim();

        Product p = stock.get(name);
        if (p == null) {
            System.out.println("Produto não encontrado!");
            return;
        }

        System.out.print("Nova quantidade: ");
        int qty = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Novo preço (R$): ");
        double price = Double.parseDouble(sc.nextLine().trim());

        p.setQty(qty);
        p.setPrice(price);
        System.out.println("Produto atualizado com sucesso!");
    }

    private static void showStock() {
        if (stock.isEmpty()) {
            System.out.println("Estoque vazio!");
            return;
        }
        System.out.println("\n--- Estoque Atual ---");
        for (Product p : stock.values()) {
            System.out.println(p);
        }
    }
}

class Product {
    private String name;
    private int qty;
    private double price;

    Product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " | Quantidade: " + qty + " | Preço: R$ " + String.format("%.2f", price);
    }
}
