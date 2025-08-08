
import java.awt.image.ByteLookupTable;
import java.util.ArrayList;

class BooksData {

    private String author;
    private String title;
    private String ISBN;
    private static ArrayList<BooksData> bookcollection = new ArrayList<>();

    public BooksData(String author, String title, String ISBN) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public static ArrayList<BooksData> getBookCollection() {
        return bookcollection;
    }

    public static void add_book(BooksData B) {
        bookcollection.add(B);
    }

    public static void remove_book(BooksData B) {
        bookcollection.remove(B);
    }

}

class Book {

    public static void main(String[] args) {

        BooksData Book1 = new BooksData("Hybert Schildt", "JAVA Complete referance", "123456789");
        BooksData Book2 = new BooksData("Guido van Rossum", "An Introduction to Python", "123456789");

        BooksData.add_book(Book1);
        BooksData.add_book(Book2);

        ArrayList<BooksData> bookCollection = BooksData.getBookCollection();

        System.out.println();
        System.out.println("List of books:");

        System.out.println();
        for (BooksData B : bookCollection) {
            System.out.println(B.getTitle() + " by " + B.getAuthor() + ", ISBN: " + B.getISBN());
            System.out.println();
        }

    }
}
