package files;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileExamples {

    public static void readTextFileFromResources() throws IOException {
        try (InputStream inputStream=FileExamples.class.getResourceAsStream("/file.txt")) {
            Scanner sc=new Scanner(inputStream);
            while(sc.hasNext())
                System.out.println(sc.nextLine());
        }// InputStream automatisk close the file
    }
    public static void readTextFileFromAbsolutePath(){
        String path=System.getProperty("user.home") //user.home=C:\\Users\Martin\\
                + File.separator + "Documents"
                + File.separator + "code.txt";
        File file=new File(path);
        try {
            FileReader fileReader=new FileReader(file);
            Scanner scanner=new Scanner(fileReader);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());}
            scanner.close(); // FileRead must have close()

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    public static void WriteTextFile(File file, String text){
        try (FileWriter filewriter = new FileWriter(file)){
            filewriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveAndeReastoreBookListExample(){
        ArrayList<Book> books= new ArrayList<>();
        Book book=new Book("Martin", "java Programming");
        books.add(book);
        Book book1=new Book("Kuntsson", "Html for Experts");
        books.add(book1);
        String path=System.getProperty("user.home") //user.home=C:\\Users\Martin\\
                + File.separator + "Documents"
                + File.separator + "books.bin";
        File file=new File(path);
        //save object to file run before closing the programm
        try (ObjectOutputStream out =
                    new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
           out.writeObject(books);
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
       }
        //        //Load from file, run this code first in your programme  on start
       try (ObjectInputStream in =
                     new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            ArrayList<Book> b = (ArrayList<Book>) in.readObject();
//            System.out.println(b.get(0));
//            System.out.println(b.get(1));
           System.out.println(b);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
           // on First start you will end up here. no file available
        } catch (IOException e) {
           e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
//        readTextFileFromResources();
//        readTextFileFromAbsolutePath();
//        String path=System.getProperty("user.home") //user.home=C:\\Users\Martin\\
//                + File.separator + "Documents"
//                + File.separator + "index.html";
//        File file=new File(path);
//        WriteTextFile(file,"<DOCTYPE html>" +
//                        "<html>" +
//                        "<head>" +
//                "<title> Test html doc.</title>" +
//                "</head>" +
//                "<body></body>" +
//                "</html>");
        saveAndeReastoreBookListExample();
    }
}
