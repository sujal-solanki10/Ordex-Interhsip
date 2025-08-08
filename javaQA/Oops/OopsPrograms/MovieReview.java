
import java.util.ArrayList;
import java.util.Arrays;

class Movie {

    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> review;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.review = new ArrayList<>();
    }

    public void addReview(Review r) {
        this.review.add(r);
    }

    public ArrayList<Review> getReview() {
        return this.review;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

}

class Review {

    private String reviewName;
    private String reviewText;
    private double rating;

    public Review(String reviewName, String reviewText, double rating) {
        this.rating = rating;
        this.reviewName = reviewName;
        this.reviewText = reviewText;
    }

    public String getRName() {
        return reviewName;
    }

    public String getRText() {
        return reviewText;
    }

    public double getRating() {
        return rating;
    }

}

public class MovieReview {

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", "James Cameron",
                new ArrayList<String>(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));

        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);
        Review review6 = new Review("Gadi wala seen & Drawing wala seen !!", "Nabin Maity", 5.0);

        movie.addReview(review1);
        movie.addReview(review2);
        movie.addReview(review3);
        movie.addReview(review4);
        movie.addReview(review6);

        Movie movie2 = new Movie("throught My window ", "Netflix",
                new ArrayList<String>(Arrays.asList("Raquel", "Ares")));
        Review review11 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review22= new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review32= new Review("A classic that never gets old.", "Nele Athol", 4.0);

        movie2.addReview(review1);
        movie2.addReview(review2);
        movie2.addReview(review3);

        System.out.println("\nReviews for '" + movie.getTitle() + "':");
        for (Review review : movie.getReview()) {
            System.out.println(review.getRText() + " by " + review.getRName() + " - " + review.getRating());
        }
        System.out.println("\nReviews for '" + movie2.getTitle() + "':");
        for (Review review : movie2.getReview()) {
            System.out.println(review.getRText() + " by " + review.getRName() + " - " + review.getRating());
        }

    }
}
