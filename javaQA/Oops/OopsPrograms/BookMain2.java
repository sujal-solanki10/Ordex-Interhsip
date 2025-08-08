
import java.sql.Array;
import java.util.ArrayList;


class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}

class Library{
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }
    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);
    }

    public ArrayList<Book> getBook(){
        return books;
    }
    

}

public class BookMain2 {
    public static void main(String[] args) {
        Library library = new Library();

        Book Book1 = new Book("Hybert Schildt", "JAVA Complete referance");
        Book Book2 = new Book("Guido van Rossum", "An Introduction to Python");
        Book Book3 = new Book("Guido van Rossum", "An Introduction to Python");
        Book Book4 = new Book("Guido van Rossum", "An Introduction to Python");

        library.addBook(Book1);
        library.addBook(Book2);

        System.out.println();
        System.out.println("Books in the library:");
        System.out.println();
        ArrayList<Book> books = library.getBook();
        for(Book b : books){
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }

        library.removeBook(Book2);
        System.out.println();
        System.out.println("Books in the library:");
        System.out.println();
        for (Book b : books) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }

    }
    
}
