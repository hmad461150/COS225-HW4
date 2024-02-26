public class Book {
    
    String title;
    String genre;
    
    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title;
    }


}
