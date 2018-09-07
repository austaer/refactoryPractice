package com.refactor;

import com.refactor.main.Customer;
import com.refactor.main.Movie;
import com.refactor.main.Rental;

public class Main {
    public static final void main(String args[]) {
        Customer customer = new Customer("Bob");
        Movie movie = new Movie("大逃殺", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);
        System.out.print(customer.statement());
    }
}
