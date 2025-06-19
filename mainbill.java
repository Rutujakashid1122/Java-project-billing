package encapsulation.data;

public class mainbill {
    public static void main(String[] args) {
        customer customer = new customer(101, "Alice", "123 Main St", "9876543210");

        product p1 = new product(1, "Pen", 10, 5.5);
        product p2 = new product(2, "Notebook", 2, 40.0);
        product p3 = new product(3, "Eraser", 5, 3.0);

        bill b = new bill();
        b.setOrder(customer, p1, p2, p3);
    }
}
