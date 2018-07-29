package com.toboza;

import java.util.LinkedList;
import java.util.Stack;

public class Zad_stos_kolejka {

    public static void main(String[] args) {


        Stack<Character> stos = new Stack<>();


        stos.push('K');
        stos.push('A');
        stos.push('J');
        stos.push('A');
        stos.push('M');



        Dancer Monika = new Dancer("Monika",'f');
        Dancer Tadek = new Dancer("Tadek",'m');
        Dancer Mietek = new Dancer("Mietek",'m');
        Dancer Jozek = new Dancer("Jozek",'m');
        Dancer Helena = new Dancer("Helena",'f');
        Dancer Grazyna = new Dancer("Grażyna",'f');

        LinkedList<Dancer> discoqueue = new LinkedList<>();
        discoqueue.push(Monika);
        discoqueue.push(Tadek);
        discoqueue.push(Mietek);
        discoqueue.push(Jozek);
        discoqueue.push(Helena);
        discoqueue.push(Grazyna);

        System.out.println(discoqueue.toString());

        //Zadanie 1
       // System.out.println(doStringa(stos));

        //Zadanie 2;
       // System.out.println(czyPalindrom(stos));

        ParyNaDisco(discoqueue);



    }

    public static String doStringa(Stack<Character> a) {
        String b = "";
        while (a.size() > 0) {
            b = b + a.pop();
        }
        return b;
    }

    public static boolean czyPalindrom(Stack<Character> a) {
        String b = "";
        String c = "";
        boolean czyPal;
        for (Character next : a) {
            b = b + next;
        }
        c = doStringa(a);
        System.out.println(b + "\n" + c);
        czyPal = (b.equals(c));
        return czyPal;
    }
    static class Dancer{
        String imie;
        Character gender;

        public Dancer(String imie, Character gender) {
            this.imie = imie;
            this.gender = gender;
        }

        public String getImie() {
            return imie;
        }

        public Character getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return ("Imie : "+ imie+ ",  Gender : "+gender+"\n");
        }
    }

    public static void ParyNaDisco(LinkedList<Dancer> tancerz){
        LinkedList<Dancer> kobiety = new LinkedList<>();
        LinkedList<Dancer> mezczyzni = new LinkedList<>();
        int i=1;

        while(tancerz.size()>0) {
            if (tancerz.peek().gender.equals('f')) {
                kobiety.push(tancerz.poll());
            } else {
                mezczyzni.push(tancerz.poll());
            }
        }
        while (kobiety.size()>0 && mezczyzni.size()>0){
            System.out.println("Para nr "+i+ " " + mezczyzni.poll().getImie()+ "  "+
                    kobiety.poll().getImie()+" ");
            i++;
        }

    }

}

