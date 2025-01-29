import java.util.Scanner;

public class MovieManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie head = new Movie("DDLJ", "Raju", 1993, 4.5);

        System.out.println("Enter the detail of 2 movies: ");
        Movie curr = head;

        for(int i=0; i<2; i++) {
            System.out.println("Enter the title of the movie: ");
            String title = input.next();

            System.out.println("Enter the author of the movie: ");
            String author = input.next();

            System.out.println("Enter the year of release of the movie: ");
            int yearOfRelease = input.nextInt();

            System.out.println("Enter the rating of the movie: ");
            double rating = input.nextDouble();

            Movie temp = new Movie(title, author, yearOfRelease, rating);
            temp.prev = curr;
            curr.next = temp;

            curr = temp;
        }

        head = addMovieAtBeginning(head, input);
        head = addMovieAtSpecificPosition(head, input, 2);
        head = addMovieAtEnd(head, input);
        head = removeMovieByTitle(head, "xdfg");

        Movie movie = searchMovieByDirector(head, "Raju");
        if(movie != null) movie.displayMovieDetails();

        displayMovieRecordInForwardAndBackwardOrder(head);
        updateMovieRatingByTitle(head, "DDLJ", 5.0);
    }

    private static void updateMovieRatingByTitle(Movie head, String title, double rating) {
        while(head != null && !head.title.equals(title)) {
            head = head.next;
        }

        if(head != null) head.title = title;
    }

    private static void displayMovieRecordInForwardAndBackwardOrder(Movie head) {
        System.out.println("--------------- Displaying the movie record in forward direction ------------");
        Movie curr = head;

        while(head != null) {
            curr = head;
            head.displayMovieDetails();
            head = head.next;
        }

        System.out.println("-------- Displaying the movie record in backward direction ---------");

        while(curr != null) {
            curr.displayMovieDetails();
            curr = curr.prev;
        }

        System.out.println("Done with movie details...");
    }


    private static Movie searchMovieByDirector(Movie head,String director) {
        while(head != null && !head.director.equals(director)) {
            head = head.next;
        }

        return head;
    }

    private static Movie removeMovieByTitle(Movie head,String title) {
        Movie curr = head;

        while(curr != null && curr.title.equals(title)) {
            curr = curr.next;
        }

        if(curr != null) {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }

        return head;
    }

    private static Movie addMovieAtEnd(Movie head, Scanner input) {
        System.out.println("Enter the title of the movie: ");
        String title = input.next();

        System.out.println("Enter the author of the movie: ");
        String author = input.next();

        System.out.println("Enter the year of release of the movie: ");
        int yearOfRelease = input.nextInt();

        System.out.println("Enter the rating of the movie: ");
        double rating = input.nextDouble();

        Movie temp = new Movie(title, author, yearOfRelease, rating);
        Movie curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;
    }

    private static Movie addMovieAtSpecificPosition(Movie head, Scanner input, int position) {
        if(position <= 0) {
            System.out.println("Enter a valid position...");
            return null;
        }

        System.out.println("Enter the title of the movie: ");
        String title = input.next();

        System.out.println("Enter the author of the movie: ");
        String author = input.next();

        System.out.println("Enter the year of release of the movie: ");
        int yearOfRelease = input.nextInt();

        System.out.println("Enter the rating of the movie: ");
        double rating = input.nextDouble();

        Movie temp = new Movie(title, author, yearOfRelease, rating);
        position--;

        if(position == 0) {
            temp.next = head;
            head.prev = temp;
            head = temp;
        } else {
            position--;
            Movie curr = head;

            while(position > 0) {
                curr = curr.next;
                position--;
            }

            temp.next = curr.next;
            curr.next.prev = temp;
            temp.prev = curr;
            curr.next = temp;
        }

        return head;
    }

    private static Movie addMovieAtBeginning(Movie head, Scanner input) {
        System.out.println("Enter the title of the movie: ");
        String title = input.next();

        System.out.println("Enter the author of the movie: ");
        String author = input.next();

        System.out.println("Enter the year of release of the movie: ");
        int yearOfRelease = input.nextInt();

        System.out.println("Enter the rating of the movie: ");
        double rating = input.nextDouble();

        Movie temp = new Movie(title, author, yearOfRelease, rating);
        temp.next = head;
        head.prev = temp;
        head = temp;

        return head;
    }
}
