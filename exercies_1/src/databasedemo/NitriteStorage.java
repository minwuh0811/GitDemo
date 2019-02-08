package databasedemo;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.Cursor;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

public class NitriteStorage {
    Nitrite db;
    ObjectRepository<Customer> customers;

    public NitriteStorage() {
        Nitrite db = Nitrite.builder()
                .compressed()
                .filePath("nitrite.db")
                .openOrCreate();
        customers=db.getRepository(Customer.class);

    }
    public void close() {
        db.close();
    }

    public void addCustomer(Customer customer) {
        customers.insert(customer);

    }

    public Customer findFirstCustomer(String name) {
        Cursor<Customer> cursor= customers.find(ObjectFilters.eq("name",name));
        Customer customer=cursor.firstOrDefault();
        return customer;
    }
}