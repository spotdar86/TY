import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class s4q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Product[] products = new Product[n];

        System.out.println("Enter details for " + n + " products:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Product name: ");
            String name = scanner.nextLine();

            System.out.print("Product price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(id, name, price);
        }

        Product productWithMinPrice = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price < productWithMinPrice.price) {
                productWithMinPrice = products[i];
            }
        }

        System.out.println("\nProduct with minimum price:");
        System.out.println("Product ID: " + productWithMinPrice.id);
        System.out.println("Product name: " + productWithMinPrice.name);
        System.out.println("Product price: " + productWithMinPrice.price);
        scanner.close();
    }
}