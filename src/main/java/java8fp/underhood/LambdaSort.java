package java8fp.underhood;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSort {

    public void sort(String[] arr) {
        Arrays.sort(arr, (a, b) ->
                Integer.valueOf(a).compareTo(Integer.valueOf(b)));
    }

}
