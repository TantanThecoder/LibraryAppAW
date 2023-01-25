package LibraryApp;
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        Movies[] movies = new Movies[2];

        books[0] = new Book();
        books[1] = new Book();

        books[0].setTitle("Jonathan Äventyr i orten");
        books[0].setAuthor("Jonathan Thege");
        books[0].setPrice(159);

        books[1].setTitle("Jonahans äventyr i orten 2");
        books[1].setAuthor("Jonathan Thege");
        books[1].setPrice(189);

        for (int i = 0; i < books.length; i++){
            books[i].printBookInfo();

        }


        movies[0] = new Movies();
        movies[1] = new Movies();

        movies[0].setTitle("Jonahans äventyr");
        movies[0].setGenre(MovieGenre.ACTION);
        movies[0].setPrice(250);

        movies[1].setTitle("Jonathan Thege");
        movies[1].setGenre(MovieGenre.ACTION);
        movies[1].setPrice(259);

        for (int i = 0; i < movies.length; i++){
            movies[i].printMovieInfo();

        }


    }
    public static void printMovieDetails(Movies movie){
        System.out.println("Title: " + movie.getTitle() + "\nGenre: " + movie.getGenre() + "\nPrice: " + movie.getPrice());
        System.out.println();
    }


}