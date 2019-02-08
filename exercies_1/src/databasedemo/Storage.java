package databasedemo;

public interface Storage {

    public void addCustomer(Customer customer);
    Customer findFirstCustomer(String name);
    void close();


}
