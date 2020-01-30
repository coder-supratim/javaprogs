package tim.concepts.algo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UnpairedElementOfArray {

  public static void main(String[] args) {
    int arr[] = {9, 3, 9, 6, 9, 7, 9};
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (hm.containsKey(arr[i])) {
        hm.put(arr[i], hm.get(arr[i]) + 1);
      } else {
        hm.put(arr[i], 1);
      }
    }
    // int result = hm.entrySet().stream().filter(x -> {if (x.getValue() ==1) {return true;}return
    // false; });

    List<Integer> unpairedElements = hm.entrySet().stream().filter(e -> e.getValue() == 1)
        .map(Map.Entry::getKey).collect(Collectors.toList());
    System.out.println("Uppaired Element: " + unpairedElements);
  }

}
