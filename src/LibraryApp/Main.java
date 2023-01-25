package LibraryApp;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Jonathans Äventyr", "Jonathan Thege", 159);
        Book book2 = new Book("Hur man becknar i centan utan att bli klippt", "Jonathan Thege", 189);
        printBookInfo(book1);

        Movies movie1 = new Movies("Once upon a time in hollywowd", MovieGenre.ACTION, 250);
        Movies movie2 = new Movies("Fury", MovieGenre.ACTION, 250);
        printMovieDetails(movie2);

    }

    static void printBookInfo (Book book){
        System.out.println("Author: " + book.getAuthor() + "\n" + "Title: " + book.getTitle() + "\n" + "Price: "+ book.getPrice() + " kr");
        System.out.println();

    }
    public static void printMovieDetails(Movies movie){
        System.out.println("Title: " + movie.getTitle() + "\nGenre: " + movie.getGenre() + "\nPrice: " + movie.getPrice());
        System.out.println();
    }


}