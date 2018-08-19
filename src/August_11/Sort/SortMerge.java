package August_11.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortMerge {
    public static void main(String[] args) {
        Integer[] unsortedtab = {11, 1, 10, 3, 8, 7, 4, 5, 2, 6, 9};
        Integer[][] res = tableSplit(unsortedtab);

        System.out.println(Arrays.toString(res[0]));
        System.out.println(Arrays.toString(res[1]));

        System.out.println(Arrays.toString(tableMerge(res[0], res[1])));
        System.out.println(Arrays.toString(merge(unsortedtab,0,5,10)));


    }

    static public Integer[][] tableSplit(Integer[] tab) {
        Integer[] tabResult1 = new Integer[tab.length / 2];
        Integer[] tabResult2 = new Integer[tab.length - (tab.length / 2)];
        Integer[][] tabResult = {tabResult1, tabResult2};

        for (int i = 0; i <= tabResult1.length - 1; i++) {
            tabResult1[i] = tab[i];
        }
        for (int i = 0; i <= tabResult2.length - 1; i++) {
            tabResult2[i] = tab[i + tabResult1.length];
        }
        return tabResult;

    }

    static public Integer[] tableMerge(Integer[] tab1, Integer[] tab2) {
        Integer[] resultTable = new Integer[tab1.length + tab2.length];
        for (int i = 0; i <= tab1.length - 1; i++) {
            resultTable[i] = tab1[i];
        }
        for (int i = 0; i <= tab2.length - 1; i++) {
            resultTable[tab1.length + i] = tab2[i];
        }
        return resultTable;
    }

    static public Integer[] tableSortAndMerge(Integer[] tab1, Integer[] tab2) {
        Integer[] resultTable = new Integer[tab1.length + tab2.length];
        Integer min1 = tab1[0];
        Integer min2 = tab2[0];
        Integer index1 = 0;
        Integer index2 = 0;
        Set<Integer> indeksy1 = new HashSet<>();
        Set<Integer> indeksy2 = new HashSet<>();

        for (Integer j = 0; j <= resultTable.length - 1; j++) {
            min1 = Integer.MAX_VALUE;
            min2 = Integer.MAX_VALUE;

            for (Integer i = 0; i <= tab1.length - 1; i++) {
                if (indeksy1.contains(i)) continue;
                if (tab1[i] < min1) {
                    min1 = tab1[i];
                    index1 = i;
                    System.out.print(j + ".1." + i + "   ");
                    System.out.println(indeksy1.toString());
                }
            }

            for (Integer i = 0; i <= tab2.length - 1; i++) {
                if (indeksy2.contains(i)) continue;
                if (tab2[i] < min2) {
                    min2 = tab2[i];
                    index2 = i;
                    System.out.print(j + ".2." + i + "   ");
                    System.out.println(indeksy2.toString());
                }
            }
            if (min2 > min1) {
                resultTable[j] = min1;
                indeksy1.add(index1);
            } else {
                resultTable[j] = min2;
                indeksy2.add(index2);
            }
        }
        return resultTable;
    }

    static public Integer[] merge(Integer[] tablica, int left, int mid, int right) {
        Integer[] temp = new Integer[tablica.length];
        int leftIndex = left;
        int rightIndex = mid+1;

        for(int k = left; k<= right;k++){
            if(leftIndex > mid || (rightIndex <= right && tablica[rightIndex]< tablica[rightIndex] )){
                temp[k] = tablica[rightIndex];
                rightIndex++;
            }else {
                temp[k]= tablica[leftIndex];
                leftIndex++;
            }
        }
       for(int k=left;k<=right;k++){
           tablica[k]=temp[k];
       }
     return tablica;
    }

}
