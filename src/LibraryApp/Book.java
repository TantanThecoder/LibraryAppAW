package LibraryApp;

public class Book {
     String title;
     String author;
     int price;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
     public void printBookInfo () {
         System.out.println("Author: " + getAuthor() + "\nTitle: " + getTitle() + "\nPrice: " + getPrice());
         System.out.println();
     }
}
