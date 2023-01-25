package LibraryApp;

public class Movies {
    String title;
    MovieGenre genre;
    int price;

    public Movies(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }
}
