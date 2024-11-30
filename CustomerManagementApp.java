import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerManagementApp {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "Doe", 1, 1000.50));
        customers.add(new Customer("Jane", "Smith", 2, 2000.75));
        customers.add(new Customer("Alice", "Johnson", 3, 1500.25));
        customers.add(new Customer("Bob", "Davis", 4, 800.30));

        Collections.sort(customers, new CustomerSorter());

        for (Customer customer : customers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " | ID: " + customer.getId() + " | Balance: " + customer.getBalance());
        }
    }
}
