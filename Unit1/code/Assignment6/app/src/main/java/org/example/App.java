package org.example;

import java.util.Scanner;


public class App {

    public String checkSign(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public String getDayName(int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day";
        }
    }

    public long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int sumUntil(int limit) {
        int sum = 0;
        int current = 1;
        do {
            sum += current;
            current++;
        } while (current <= limit);
        return sum;
    }

    public static void main(String[] args) {
        App app = new App();

        // if-else
        System.out.println("checkSign(-10) = " + app.checkSign(-10));  
        System.out.println("checkSign(0) = " + app.checkSign(0));      
        System.out.println("checkSign(5) = " + app.checkSign(5));      

        // switch-case
        System.out.println("\ngetDayName(1) = " + app.getDayName(1));  
        System.out.println("getDayName(7) = " + app.getDayName(7));    
        System.out.println("getDayName(9) = " + app.getDayName(9));    

        // for loop
        System.out.println("\ncalculateFactorial(5) = " + app.calculateFactorial(5)); 
        System.out.println("calculateFactorial(0) = " + app.calculateFactorial(0));   

        // while loop
        System.out.println("\nisPrime(7) = " + app.isPrime(7));   
        System.out.println("isPrime(8) = " + app.isPrime(8));     
        System.out.println("isPrime(1) = " + app.isPrime(1));     

        // do-while
        System.out.println("\nsumUntil(5) = " + app.sumUntil(5)); 
    }
}

