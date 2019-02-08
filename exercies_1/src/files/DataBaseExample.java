package files;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBaseExample {
    public static void main(String[] args) {
        ArrayList<Book> books= new ArrayList<>();
        Book book=new Book("Martin", "java Programming");
        books.add(book);
        Book book1=new Book("Kuntsson", "Html for Experts");
        books.add(book1);
        System.out.println(books);
        String path="jdbc:sqlite:test.db";
        // "jdbc:sqlite:memory"; Memory only database
       try {
           Connection sqliteConnection= DriverManager.getConnection(path);
           //Skap database och tabell för Books
           String sql_create_table="CREATE TABLE IF NOT EXISTS Books(" +
                   "bookID integer PRIMARY KEY," +
                   "Title TEXT," +
                   "Author TEXT);";
           Statement stmt= sqliteConnection.createStatement();
           stmt.execute(sql_create_table);

           //Lägg till 2 böcker till tablellen
           String sql_insert_book1="INSERT INTO Books(Title,Author) VALUES ('Martin', 'Become a Java Guru');";

           String sql_insert_book2="INSERT INTO Books(Title,Author) VALUES ('Svensson', 'Are you a programmer?');";

           stmt.execute(sql_insert_book1);
           stmt.execute(sql_insert_book2);
           Scanner scanner = new Scanner(System.in);
//           System.out.println(" Enter name to search for: ");
//           String name=scanner.nextLine();
//           //Hämta alla böcker och skriv ut dessa
//            String sql_select_books="SELECT * FROM Books WHERE Title='" + name + "';";
//            ResultSet resultset=stmt.executeQuery(sql_select_books);
//            while(resultset.next())
//            {
//                System.out.println(resultset.getInt("bookID"));
//                System.out.println(resultset.getString("Title"));
//                System.out.println(resultset.getString("Author"));
//            }
           System.out.println(" Enter name to delete: ");
           String name1=scanner.nextLine();
           //Hämta alla böcker och skriv ut dessa
//           String sql_delete="DELETE FROM Books WHERE Title = '" + name1 + "';"; // ' or 1=1' DDELETE FROM Books WHERE Title ='' or 1=1;--';";
//           stmt.execute(sql_delete);
           String sql_delete="DELETE FROM Books WHERE Title =?";
           PreparedStatement prestmt=sqliteConnection.prepareStatement(sql_delete);
           prestmt.setString(1, name1);
           prestmt.execute();

           String sql_select_books1="SELECT * FROM Books;";
           ResultSet resultset1=stmt.executeQuery(sql_select_books1);
           while(resultset1.next())
           {
               System.out.println(resultset1.getInt("bookID"));
               System.out.println(resultset1.getString("Title"));
               System.out.println(resultset1.getString("Author"));
           }



           sqliteConnection.close();
       } catch (SQLException e) {
           e.printStackTrace();
       }
    }
}
