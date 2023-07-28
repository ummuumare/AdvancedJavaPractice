package practice.SerializationPractice;

import java.io.*;

// Task:Book tipinde nesneler üretip bu nesneleri
//books.txt dosyasına kaydedin ve sonra bu dosyadan
//nesneleri okuyun
public class Seriliazition {
    public static void main(String[] args) {
     //   writeObject();
        readObject();
    }

    public static void writeObject() {
        Book book1 = new Book("Martin Eden", "Jack London", 1980);
        Book book2 = new Book("1980", "George Orwell", 1940);
        Book book3 = new Book("Demir Okce", "Jack London", 1920);

        try {
            FileOutputStream fos = new FileOutputStream("books.txt");
            ObjectOutputStream write = new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readObject() {
        try {
            //
            FileInputStream fis = new FileInputStream("books.txt");
            //nesneleri okumak icin
            ObjectInputStream read = new ObjectInputStream(fis);
            Book book1 = (Book) read.readObject();
            Book book2 = (Book) read.readObject();
            Book book3 = (Book) read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
            fis.close();
            read.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
