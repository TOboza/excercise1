package August_11.Sort;

import java.util.Arrays;

public class Heap {

    public static void main(String[] args) {
        Integer[] tab = {8, 7, 6, 6, 4, 2, 5, 2, 1, 4, 3, 6, 6, 4};
        System.out.println(leftSonNumber(3));
        System.out.println(rightSonNumber(3));
        System.out.println(isGreater(tab, 12));
        System.out.println(Arrays.toString(buildHeap(tab)));
    }

    Integer value;
    Heap leftSon;
    Heap rightSon;
    int k;
    int n;

    public enum CHILD {
        LEFT,
        RIGHT;
    }

    public static int leftSonNumber(int k) {
        return 2 * k + 1;
    }

    public static int rightSonNumber(int k) {
        return 2 * k + 2;
    }

    public static int fathersNumber(int k) {
        return (k - 1) / 2;
    }

    public static boolean ifLeftExist(int k, int n) {
        if ((2 * k + 1) < n) return true;
        else return false;
    }

    public static boolean ifRightExist(int k, int n) {
        if ((2 * k + 2) < n) return true;
        else return false;
    }

    public static boolean isLeaf(int k, int n) {
        if ((2 * k + 2) > n) return true;
        else return false;
    }

    public static boolean isGreater(Integer[] tablica, int k) {
        System.out.println("Child : " + tablica[k] + " index : " + k + " , partent : "
                + tablica[fathersNumber(k)] + " , father's index : " + fathersNumber(k));
        if (tablica[k] > tablica[fathersNumber(k)]) {
            return true;
        } else return false;
    }

//    public static void swapFatherAndChild(Integer[] tablica, CHILD child){
//        if(child == CHILD.LEFT){
//            Integer temp =
//
//        }
//
//    }

    public static Integer[] buildHeap(Integer[] tablica) {
        for (int i = 1; i <= (tablica.length - 1); i++) {
            int j = i;
            int k = fathersNumber(j);
            Integer x = tablica[i];
            while (k >= 0 && tablica[k] < x) {
                tablica[j] = tablica[k];
                j = k;
                k = fathersNumber(j);
            }
            tablica[j] = x;

        }
        return tablica;
    }

    public static Integer[] shiftHeap(Integer[] tablica) {
        Integer pomoc;
        for (int i = tablica.length - 1; i >= 1; i--) {
            pomoc = tablica[0];
            tablica[0] = tablica[i];
            tablica[i] = pomoc;
            int j = 0;
            int k = 0;
            while (k < i) {
                int m = k;
                if (k + 1 < i && tablica[k + 1] > tablica[k]) {
                    m = k + 1;
                }
                if(tablica[m]<= tablica[j]) break;
                pomoc = tablica[j];
                tablica[i]= tablica[j];
                tablica[j]=pomoc;
                j=m;
                k=j*2+1;
            }

        }
        return tablica;
    }

    public static Integer[] heapSort(Integer[] tablica){
        buildHeap(tablica);
        shiftHeap(tablica);
        return tablica;
    }
}


