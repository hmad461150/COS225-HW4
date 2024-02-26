import java.util.*;

public class BookShelf {
    char letter;
    ArrayList<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>(8);
    }

    public void addBook(Book aBook) {
        if (shelf.size() < 9) {
            if (aBook.toString().charAt(0) == letter) {
                shelf.add(aBook);
            }
        }
    }

    public void removeBook() {
        shelf.removeLast();
    }



    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public String toString() {
        String bookTitles = "";
        
        if (shelf.isEmpty()) 
            return "Empty";

        for (Book b: shelf) {
            bookTitles += (b.toString()) + " ";
        }

        return bookTitles;
    }

}
