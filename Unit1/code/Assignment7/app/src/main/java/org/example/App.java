package org.example;

import java.util.Arrays;

public class App {

    public int[] swapByValue(int a, int b) {
        // Return them in reversed positions
        return new int[]{b, a};
    }

    public void swapByReference(int[] arr) {
        // arr[0] and arr[1] exist
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        App app = new App();

        // Demonstrate swapByValue
        int a = 5, b = 10;
        int[] swapped = app.swapByValue(a, b);
        System.out.println("swapByValue results: " + Arrays.toString(swapped));
        // a and b remain the same outside this function (5, 10)

        // Demonstrate swapByReference
        int[] pair = {5, 10};
        app.swapByReference(pair);
        System.out.println("swapByReference results: " + Arrays.toString(pair));
        // The original array is modified in-place
    }
}
