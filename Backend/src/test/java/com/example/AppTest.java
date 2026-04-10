package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddPositive() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testAddNegative() {
        App app = new App();
        assertEquals(-1, app.add(-2, 1));
    }

    @Test
    public void testAddZero() {
        App app = new App();
        assertEquals(2, app.add(2, 0));
    }

    @Test
    public void testAddBothNegative() {
        App app = new App();
        assertEquals(-5, app.add(-2, -3));
    }
}
