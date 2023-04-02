package ru.netology.posterTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poser.MovieManager;

public class ManagerTest {

    @Test
    public void zeroFilmTest() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void oneFilmTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllTest() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] expected = {"Film 1","Film 2","Film 3","Film 4","Film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
