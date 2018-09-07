import com.refactor.Customer;
import com.refactor.Movie;
import com.refactor.Rental;

public class Main {
    public static final void main(String args[]) {
        Customer customer = new Customer("Bob");
        Movie movie = new Movie("大逃殺", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);
        System.out.print(customer.statement());
    }
}
