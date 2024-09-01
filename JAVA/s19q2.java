import java.util.Scanner;
abstract class Order {
    protected int id;
    protected String description;

    public Order(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public abstract void accept();
    public abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;

    public PurchaseOrder(int id, String description, String customerName) {
        super(id, description);
        this.customerName = customerName;
    }

    @Override
    public void accept() {
        System.out.print("Enter ID: ");
        id = new Scanner(System.in).nextInt();
        System.out.print("Enter Description: ");
        description = new Scanner(System.in).nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = new Scanner(System.in).nextLine();
       
    }

    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

public class s19q2 {
    public static void main(String[] args) {
        PurchaseOrder[] purchaseOrders = new PurchaseOrder[3];

        for (int i = 0; i < purchaseOrders.length; i++) {
            purchaseOrders[i] = new PurchaseOrder(i + 1, "", "");
            purchaseOrders[i].accept();
        }

        for (PurchaseOrder purchaseOrder : purchaseOrders) {
            purchaseOrder.display();
        }
    }
}