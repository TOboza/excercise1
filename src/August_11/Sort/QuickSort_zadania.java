package August_11.Sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort_zadania {

    public static void main(String[] args) {
        Integer[] tablica = {1, 9, 8, 2, 4, 3, 6, 0, 5};
//        System.out.println(pickMid(tablica));
//        System.out.println(Arrays.toString(minorTab(tablica, 5)));
//        System.out.println(Arrays.toString(majorTab(tablica, 5)));
        System.out.println(Arrays.toString(quickSort(tablica,0,tablica.length-1)));


    }


    public static Integer pickMid(Integer[] inputTab) {

        return inputTab.length / 2;
    }

    public static Integer pickRandomIndex(Integer[] inputTab) {
        Random rand = new Random();
        return rand.nextInt(inputTab.length);
    }

    public static Integer[] minorTab(Integer[] inputTab, int pivot) {
        int resultLength = 0;
        for (int i = 0; i < inputTab.length; i++) {
            if (i == pivot) continue;
            if (inputTab[i] <= inputTab[pivot]) resultLength++;
        }
        Integer[] resultTab = new Integer[resultLength];
        int addIndex = 0;
        for (int i = 0; i < inputTab.length; i++) {
            if (inputTab[i] < inputTab[pivot]) {
                resultTab[addIndex] = inputTab[i];
                addIndex++;
            }
        }
        return resultTab;
    }


    public static Integer[] majorTab(Integer[] inputTab, int pivot) {
        int resultLength = 0;
        for (int i = 0; i < inputTab.length; i++) {
            if (inputTab[i] > inputTab[pivot]) resultLength++;
        }
        Integer[] resultTab = new Integer[resultLength];
        int addIndex = 0;
        for (int i = 0; i < inputTab.length; i++) {
            if (inputTab[i] > inputTab[pivot]) {
                resultTab[addIndex] = inputTab[i];
                addIndex++;
            }
        }
        return resultTab;
    }

    public static Integer[] quickSort(Integer[] inputTab, int left, int right){
        int mid = (left+right)/2;
        int j = left;
        Integer pivot = inputTab[mid];
        inputTab[mid] = inputTab[right];
        for(int i= left;i < right;i++){
            if(inputTab[i] < pivot){
                Sortowanie.swap(inputTab,i,j);
                j++;

            }
        }
        inputTab[right] = inputTab[j];
        inputTab[j] = pivot;
        if (left < j-1){
            quickSort(inputTab,left,j-1);
        }
        if(j+1<right){
            quickSort(inputTab,j+1,right);
        }
    return inputTab;
    }






}
