public class LibraryTester {
    public static void main(String[] args) {
        BookShelf oShelf = new BookShelf();
        oShelf.setLetter('O');

        BookShelf tShelf = new BookShelf();
        tShelf.setLetter('T');

        System.out.println(oShelf);
        System.out.println(tShelf);

        Book theHeart = new Book("The Heart of the Betrayed", "Crime");
        Book ourHill = new Book("Our Hill of Stars", "Fantasy");
        Book oneOfA = new Book("One of a Kind", "Fantasy");
        Book theVis = new Book("The Vision of Roses", "Romance");

        System.out.println(theHeart);
        System.out.println(ourHill);
        System.out.println(oneOfA);
        System.out.println(theVis);

        oShelf.addBook(theHeart);
        oShelf.addBook(ourHill);
        oShelf.addBook(oneOfA);
        oShelf.addBook(theVis);
        
        tShelf.addBook(theHeart);
        tShelf.addBook(ourHill);
        tShelf.addBook(oneOfA);
        tShelf.addBook(theVis);
        

        

        System.out.println(oShelf);
        System.out.println(tShelf);
    }
}
