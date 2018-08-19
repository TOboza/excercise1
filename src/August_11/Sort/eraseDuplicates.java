package August_11.Sort;

import java.util.*;
import java.util.stream.Collectors;

public class eraseDuplicates {

    public static void main(String[] args) {
        List<Integer> unsorted = new ArrayList<>();
        unsorted.add(9);
        unsorted.add(3);
        unsorted.add(8);
        unsorted.add(5);
        unsorted.add(1);
        unsorted.add(6);

        System.out.println(sortAndEraseDuplicates(unsorted).toString());

    }

    public static List<Integer> sortAndEraseDuplicates(List<Integer> input){
       List<Integer> result = new ArrayList<>();
        result.addAll(input);
        result = result.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return result;
    }



}
