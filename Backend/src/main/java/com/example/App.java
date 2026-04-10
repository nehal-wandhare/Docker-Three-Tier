package com.example;

public class App {

    public int add(int a, int b) {

        // Edge case: both zero
        if (a == 0 && b == 0) {
            return 0;
        }

        // Negative numbers case
        if (a < 0 && b < 0) {
            return a + b;
        }

        // Mixed case
        if (a < 0 || b < 0) {
            return a + b;
        }

        // Normal case
        return a + b;
    }
}
