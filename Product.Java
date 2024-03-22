import java.util.Scanner;

class Product {
    int productCode;
    String productName;
    double price;

    public Product(int productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = new Product[3];

      
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter product code:");
            int code = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter product name:");
            String name = scanner.nextLine();
            System.out.println("Enter product price:");
            double price = scanner.nextDouble();
            products[i] = new Product(code, name, price);
        }

      
        Product lowestPriceProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() < lowestPriceProduct.getPrice()) {
                lowestPriceProduct = products[i];
            }
        }

       
        System.out.println("Product with the lowest price:");
        System.out.println("Product Code: " + lowestPriceProduct.productCode);
        System.out.println("Product Name: " + lowestPriceProduct.productName);
        System.out.println("Price: " + lowestPriceProduct.price);

        scanner.close();
    }
}
