package August_11.Sort;

public class Sortowanie {

    public static void main(String[] args) {
        Integer tablica[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer unsorted[] = {5, 7, 8, 10, 4, 6, 2, 3, 9, 1};

       // swap(tablica, 1, 1);
        // printTabXRows(tablica);
        System.out.println("------------------------------------------------");
        //moveElem0ToRight(tablica);
        System.out.println("------------------------------------------------");
        //  bubbleSort(unsorted);
        // printTabMinus1(tablica);
        // bubbleSortV2(unsorted);
        //  findMin(unsorted);
        // findMinfromTo(unsorted, 1, 5);
        selectionSort(unsorted);
    }


    static public void swap(Integer[] tab, int element1, int element2) {
        Integer pomocniczy = tab[element1];
        tab[element1] = tab[element2];
        tab[element2] = pomocniczy;
    }

    static public void printTab(Integer[] table) {
        for (int i = 0; i <= table.length - 1; i++) {
            System.out.print(i + ":" + table[i] + " , ");
        }
        System.out.println("\b\b");
    }


    static public void printTabXRows(Integer[] table) {
        for (int j = 0; j <= table.length; j++) {
            printTab(table);
        }
    }

    static public void moveElem0ToRight(Integer[] table) {
        for (int j = 0; j <= table.length; j++) {
            printTab(table);
            if (j == table.length - 1) break;
            swap(table, j, j + 1);
        }
    }

    static public void bubbleSort(Integer[] table) {

        for (int j = 0; j < table.length - 2; j++) {
            for (int i = 0; i <= table.length - 2; i++) {
                if (table[i] > table[i + 1]) {
                    swap(table, i, i + 1);
                    printTab(table);
                }
            }
        }
    }

    static public void printTabMinus1(Integer[] table) {
        for (int j = 0; j <= table.length; j++) {
            for (int i = 0; i <= table.length - j; i++) {
                if (i <= table.length - j - 1) {
                    System.out.print(i + ":" + table[i] + " , ");
                }
            }
            System.out.println("\b\b");
        }

    }

    static public void bubbleSortV2(Integer[] table) {

        for (int j = 0; j < table.length - 1; j++) {
            for (int i = 0; i <= table.length - 2 - j; i++) {
                if (table[i] > table[i + 1]) {
                    swap(table, i, i + 1);
                    printTab(table);
                }
            }
        }
    }

    static public void findMin(Integer[] table) {
        Integer min = table[0];
        int minInxex = 0;
        for (int i = 1; i <= table.length - 1; i++) {
            if (table[i] < min) {
                min = table[i];
                minInxex = i;
            }
        }
        System.out.println("Najmniejsza wartosść tablicy to " + min + " , znajduje się na indeksie " + minInxex);
    }

    static public void findMinfromTo(Integer[] table, int elem1, int elem2) {
        Integer min = table[0];
        int minInxex = 0;
        for (int i = elem1; i <= elem2; i++) {
            if (table[i] < min) {
                min = table[i];
                minInxex = i;
            }
        }
        System.out.println("Najmniejsza wartosść między indeksami " + elem1 + " i " + elem2 + " to " + min + " , znajduje się na indeksie " + minInxex);
    }

    static public void selectionSort(Integer[] table) {
        Integer min;
        int minInxex = 0;

        for (int j = 0; j <= table.length - 1; j++) {
            min = table[j];
            minInxex = j;
            for (int i = j + 1; i <= table.length - 1; i++) {
                if (table[i] < min) {
                    min = table[i];
                    minInxex = i;
                    //System.out.println("wartosc minimalna " + min);
                }
            }
            swap(table, minInxex, j);

            printTab(table);
            //  System.out.println("iteracja J = " + j + "----------------------------------------------------");
        }
    }


}
