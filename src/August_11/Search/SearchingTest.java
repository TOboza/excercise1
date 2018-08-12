package August_11.Search;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SearchingTest {

    @Test
    public void search() {
        SearchAlgorithm test = new Searching();
        Integer[] a = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(test.search(4, a));


    }

    @Test
    public void findMiddle() {
        SearchAlgorithm test2 = new Searching();
        Integer[] b = {1, 2, 3, 4, 5, 6,7};
        System.out.println(((Searching) test2).findMiddle(b));
    }

//    @Test
//    public void binarySearchiter() {
//        SearchAlgorithm test3 = new Searching();
//        Integer[] c = {1, 2, 3, 4, 5, 6,7,9,10,11,12};
//        System.out.println(((Searching) test3).binarySearch(c,9));
//    }


}