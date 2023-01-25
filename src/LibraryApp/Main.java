package LibraryApp;
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Movies[] movies = new Movies[2];

        books[0] = new Book("Jonathans Äventyr", "Jonathan Thege", 159);
        books[1] = new Book("Hur man becknar i centan utan att bli klippt", "Jonathan Thege", 189);
        for (int i = 0; i < books.length; i++){
            printBookInfo(books[i]);
        }


        movies[0] = new Movies("Once upon a time in hollywowd", MovieGenre.ACTION, 250);
        movies[1] = new Movies("Fury", MovieGenre.ACTION, 250);
        for (int i = 0; i < movies.length; i++){
            printMovieDetails(movies[i]);
        }


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