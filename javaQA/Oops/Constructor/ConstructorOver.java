
class Book {

    private String Author;
    private String Title;
    private double price;

    public Book() {
        this.Author = "Unknown";
        this.Title = "Unknown";
        this.price = 0.0;

    }

    public Book(String title, String Author) {
        this.Author = Author;
        this.Title = title;
        this.price = 0.0;

    }

    public Book(String Author, String Title, double price) {
        this.Author = Author;
        this.Title = Title;
        this.price = price;
    }

    public void getInfo() {
        System.out.println("\nTitle of Book : " + Title);
        System.out.println("Book Author : " + Author);
        System.out.println("Book price : " + price);

    }

}

public class ConstructorOver {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Sujal", "Book1");
        Book b3 = new Book("Sunmit", "Book2", 201.50);

        b1.getInfo();
        b2.getInfo();
        b3.getInfo();
    }
}
