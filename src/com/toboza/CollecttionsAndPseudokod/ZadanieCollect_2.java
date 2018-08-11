package com.toboza.CollecttionsAndPseudokod;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZadanieCollect_2 {

    public static void main(String[] args) {

        bazaPracownikow();

    }
    public static void bazaPracownikow() {
        String id;
        Map<String, String> pracownicy = new HashMap<>();
        pracownicy.put("A1234", "Tadeusz Janowski");
        pracownicy.put("b1234", "Antoni Macierewicz");
        pracownicy.put("C1234", "Czesław Guzik");
        pracownicy.put("d1234", "Barbara Rabarbar");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj id pracownika do wyświetlenia");
        id = scan.nextLine();

        if (pracownicy.containsKey(id)) {
            System.out.println(pracownicy.get(id));
        } else if (pracownicy.containsKey(id.toUpperCase())) {
            System.out.println(pracownicy.get(id.toUpperCase()));
        } else if (pracownicy.containsKey(id.toLowerCase())) {
            System.out.println(pracownicy.get(id.toLowerCase()));

        }


    }
}