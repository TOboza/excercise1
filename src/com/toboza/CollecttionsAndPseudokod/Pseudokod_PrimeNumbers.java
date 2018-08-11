package com.toboza.CollecttionsAndPseudokod;

public class Pseudokod_PrimeNumbers {

    public static void main(String[] args) {
        System.out.println(is_Prime(101));

    }

    public static boolean is_Prime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            int i = 5;
            while (i * i <= n) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
                i= i+6;
            }

            return true;
        }


    }


}
