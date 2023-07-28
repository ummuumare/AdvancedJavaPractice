package practice.SerializationPractice;

import java.io.Serializable;

public class Book implements Serializable {
   private String name ;
   private String writer;
   private int publishDate;


    public Book(String name, String writer, int publishDate) {
        this.name = name;
        this.writer = writer;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
