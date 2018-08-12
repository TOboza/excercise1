package August_11.Search;

import java.util.List;

public interface SearchAlgorithm {
   Integer search(Integer value, List<Integer> input);
   Integer search(Integer value, Integer[] input);
   int searchAge(Osoba[] input, int toFind, int low, int high);
}
