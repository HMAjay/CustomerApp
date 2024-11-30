import java.util.Comparator;

public class CustomerSorter implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        int firstNameCompare = c1.getFirstName().compareTo(c2.getFirstName());
        if (firstNameCompare != 0) return firstNameCompare;

        int lastNameCompare = c1.getLastName().compareTo(c2.getLastName());
        if (lastNameCompare != 0) return lastNameCompare;

        int idCompare = Integer.compare(c1.getId(), c2.getId());
        if (idCompare != 0) return idCompare;

        return Double.compare(c1.getBalance(), c2.getBalance());
    }
}
