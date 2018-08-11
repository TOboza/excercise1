package com.toboza.CollecttionsAndPseudokod;

import java.util.ArrayList;
import java.util.Random;

public class ExcerciseCollections {

    public ArrayList<Float> floatGenerator() {
        ArrayList<Float> lista = new ArrayList<>();
        Float number0_100 = 0.00f;
        Random r = new Random();
        do {
            number0_100 = r.nextFloat() * 100;
            lista.add(number0_100);
        } while (number0_100 >= 1);

            System.out.println("Rozmiar listy : " + lista.size() + " elementów.");
            System.out.println(lista.toString());
            return lista;


    }
}