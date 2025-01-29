public class Movie {
    // Attributes
    public String title;
    public String director;
    public int yearOfRelease;
    public double rating;

    public Movie next;
    public Movie prev;

    // Parameterized constructor
    Movie(String title, String director, int yearOfRelease, double rating) {
        this.director = director;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        next = prev = null;
    }

    // Displaying the details of the movie
    public void displayMovieDetails() {
        System.out.println("Title of the movie is " + title + " and name of the director is " + director + " and release year is " + yearOfRelease + " and it is rated as " + rating);
    }
}
