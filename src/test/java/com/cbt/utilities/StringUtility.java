package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)) {
            System.out.println("PASS");
            System.out.println("Expected and actual result are same");
        } else {
            System.out.println("FAIL");
            System.out.println("Expected result is " + expected);
            System.out.println("Actual result is " + actual);
        }

    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}