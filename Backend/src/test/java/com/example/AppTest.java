package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        App app = new App();
        assertEquals(-5, app.add(-2, -3));
    }

    @Test
    public void testAddMixedNumbers() {
        App app = new App();
        assertEquals(-1, app.add(-2, 1));
    }

    @Test
    public void testAddWithZero() {
        App app = new App();
        assertEquals(2, app.add(2, 0));
    }

    @Test
    public void testAddBothZero() {
        App app = new App();
        assertEquals(0, app.add(0, 0));
    }

    @Test
    public void testAddLargeNumbers() {
        App app = new App();
        assertEquals(1000000, app.add(500000, 500000));
    }
}
