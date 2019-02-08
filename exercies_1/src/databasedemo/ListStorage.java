package databasedemo;


import java.io.*;
import java.util.ArrayList;

    public class ListStorage implements Storage  {

        ArrayList<Customer> customers = new ArrayList<>();

        ListStorage(){
            //Läs in sparade kunder från fil
            loadFromFile();
        }

        public void addCustomer(Customer customer){
            customers.add(customer);
            saveToFile();
        }

        public Customer findFirstCustomer(String name){
            for (Customer c : customers ) {
                if( c.name.equals(name))
                    return c;
            }
            return new Customer(-1,"NoOne");
        }

        private void loadFromFile() {
            String path = System.getProperty("user.home")
                    + File.separator + "Documents"
                    + File.separator + "customers.bin";
            File file = new File(path);

            //Load from file, run this code first in your program on start.
            try (ObjectInputStream in =
                         new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                customers = (ArrayList<Customer>) in.readObject();
            } catch (FileNotFoundException e) {
                //On first start you will end up here. No file available.
            } catch (IOException e) {

            } catch (ClassNotFoundException e) {

            }
        }
        public void close(){
            saveToFile();
        }
        
        private void saveToFile() {
            String path = System.getProperty("user.home")
                    + File.separator + "Documents"
                    + File.separator + "customers.bin";
            File file = new File(path);

            //Save object to file, run before closing the program
            try (ObjectOutputStream out =
                         new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
                out.writeObject(customers);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

