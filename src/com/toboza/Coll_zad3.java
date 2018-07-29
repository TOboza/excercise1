package com.toboza;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Coll_zad3 {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zdanie to przetłumaczenia na angielski");
        input = scan.nextLine();
        System.out.println(coupler(input));


    }
    public static String slownik(String input){
        Map<String,String> baza = new HashMap<>();
        baza.put("Sierotka","Orphan");
        baza.put("ma","has");
        baza.put("rysia","a Lynx");
        String answer = baza.get(input);
        return answer;
    }

    public static String coupler(String a){
    String result="";
    String[] stringTable;

    stringTable = a.split(" ");
    for(int i =0; i < stringTable.length; i++){
        if(slownik(stringTable[i]) != null) {
            result = result +" "+ slownik(stringTable[i]);
        }else {
            result = result +" "+ stringTable[i];
        }

    }

    return result;
    }

}
