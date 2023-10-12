package org.example.Movie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMovie {
    @Test
    void testSciFiMovie() {
        Movie sciFiMovie = new SciFiMovie("Star Wars", 1977, 8.6);
        assertEquals(1.0, sciFiMovie.calculatePrice());
    }

    @Test
    void testHorrorMovie() {
        Movie horrorMovie = new HorrorMovie("The Shining", 1980, 8.4);
        assertEquals(0.81, horrorMovie.calculatePrice());
    }

    @Test
    void testComedyMovie() {
        Movie comedyMovie = new ComedyMovie("Happy Gilmore", 1996, 7.0, "Adam Sandler");
        assertEquals(0.6, comedyMovie.calculatePrice());
    }

    @Test
    void testComedyMovieWithoutAdam() {
        Movie comedyMovie = new ComedyMovie("Happy Gilmore", 1996, 7.0, "Gicu");
        assertThrows(UnsupportedOperationException.class, comedyMovie::calculatePrice);
    }

    @Test
    void testOrderLineWithUnsupportedOperationThatWorks() {
        OrderLine orderLine = new OrderLine((movie, quantity) -> 0.0);

        assertEquals(0.0, orderLine.computeMoviePrice(new SciFiMovie("Star Wars", 1977, 8.6), 1));
    }


}
