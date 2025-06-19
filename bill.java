package encapsulation.data;



public class bill {
    public void setOrder(customer customer, product... products) {
        double grandTotal = 0;

        System.out.println("========= BILL =========");
        System.out.println("Customer ID   : " + customer.getId());
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Address       : " + customer.getaAddress());
        System.out.println("Contact       : " + customer.getContact());
        System.out.println("----------------------------");
        System.out.printf("%-5s %-10s %-5s %-7s %-10s%n", "ID", "Product", "Qty", "Rate", "Total");
        System.out.println("----------------------------");

        for (product p : products) {
            double Total = p.getTotal();
            grandTotal += Total;
            System.out.printf("%-5d %-10s %-5d %-7.2f %-10.2f%n",
                    p.getId(), p.getName(), p.getQty(), p.getRate(), Total);
        }

        System.out.println("----------------------------");
        System.out.printf("Grand Total: %.2f%n", grandTotal);
        System.out.println("============================");
    }
}

	
	
	


