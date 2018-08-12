package August_11.Search;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.List;

public class Searching implements SearchAlgorithm {
    public Integer search(Integer value, Integer[] input) {
        for (int i = 0; i <= input.length; i++) {
            if (input[i].equals(value)) return i;
        }
        return -1;
    }

    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    public Integer findMiddle(Integer[] input) {
        int l = input.length - 1;
        return input[l / 2];

    }
//    public Integer[] from0toA(Integer[] input, int index){
//        Integer result[] = new Integer[index];
//        for(int )
//    }

    public int binarySearch(Integer[] input, Integer toFind, int low, int high) {
        if (low >= high) return -1;
        int mid = (high + low) / 2;
        if (input[mid] > toFind) {
            System.out.println("<");
            return binarySearch(input, toFind, low, mid - 1);
        } else if (input[mid] < toFind) {
            System.out.println(">");
            return binarySearch(input, toFind, mid + 1, high);
        } else
            return mid;
    }

    //    public int binarySearchiter(Integer[] input, Integer toFind) {
//        int low = 0;
//        int high = input.length - 1;
//        int mid = (high + low) / 2;
//
//        while (low <= high) {
//
//            if (input[mid] > toFind) {
//                System.out.println("<");
//                high = mid - 1;
//            } else if (input[mid] < toFind) {
//                System.out.println(">");
//                low = mid + 1;
//            } else
//                return mid;
//        }
//        return -1;
//    }

    public int searchAge(Osoba[] input, int toFind, int low, int high) {
        if (low >= high) return -1;
        int mid = (high + low) / 2;
        if (input[mid].age > toFind) {
            System.out.println("<");
            return searchAge(input, toFind, low, mid - 1);
        } else if (input[mid].age < toFind) {
            System.out.println(">");
            return searchAge(input, toFind, mid + 1, high);
        } else
            return mid;
    }

//    public List<Osoba> searchAgeIfNotOnlyOne(int wiek, String imie, Osoba[] input) {
//        List<Osoba> listaOsob = new ArrayList<>();
//        for (int i = 0; i <= input.length-1; i++) {
//            if (input[i].age == wiek) {
//                listaOsob.add(input[i]);
//            }
//
//            for(listaOsob::size){
//                if(listaOsob.)
//            }
//        }
//        return listaOsob;
//    }

}
