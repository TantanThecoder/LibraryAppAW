package LibraryApp;

public class Movies {
    String title;
    MovieGenre genre;
    int price;


    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printMovieInfo (){
        System.out.println("Title: " + getTitle() + "\nGenre: " + getGenre() + "\nPrice: " + getPrice());
        System.out.println();
    }
}
