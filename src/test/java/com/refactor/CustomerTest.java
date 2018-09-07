package com.refactor;

import junit.framework.TestCase;
import org.junit.Test;

public class CustomerTest extends TestCase {

    @Test
    public void testStatementNewRelease() {
        Customer customer1 = new Customer("Bob");
        Movie movie1 = new Movie("大逃殺", Movie.NEW_RELEASE);
        Rental rental3Days = new Rental(movie1, 3);
        Rental rental1Day = new Rental(movie1, 1);
        customer1.addRental(rental3Days);
        customer1.addRental(rental1Day);
        assertEquals("Rental Record for Bob\n" +
                "\t大逃殺\t9.0\n" +
                "\t大逃殺\t3.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 3frequent renter points", customer1.statement());
    }

    @Test
    public void testStatementChildren() {
        Customer customer = new Customer("Bob");
        Movie movie1 = new Movie("大逃殺", Movie.CHILDREN);
        Rental rental4Days = new Rental(movie1, 4);
        Rental rental1Day = new Rental(movie1, 1);
        customer.addRental(rental4Days);
        customer.addRental(rental1Day);
        assertEquals("Rental Record for Bob\n" +
                "\t大逃殺\t3.0\n" +
                "\t大逃殺\t1.5\n" +
                "Amount owed is 4.5\n" +
                "You earned 2frequent renter points", customer.statement());
    }

    @Test
    public void testStatementRegular() {
        Customer customer = new Customer("Bob");
        Movie movie1 = new Movie("大逃殺", Movie.REGULAR);
        Rental rental4Days = new Rental(movie1, 4);
        Rental rental1Day = new Rental(movie1, 1);
        customer.addRental(rental4Days);
        customer.addRental(rental1Day);
        assertEquals("Rental Record for Bob\n" +
                "\t大逃殺\t5.0\n" +
                "\t大逃殺\t2.0\n" +
                "Amount owed is 7.0\n" +
                "You earned 2frequent renter points", customer.statement());
    }
}
