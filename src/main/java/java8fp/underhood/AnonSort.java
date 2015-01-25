package java8fp.underhood;

import java.util.Arrays;
import java.util.Comparator;

public class AnonSort {

    public void sort(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.valueOf(a).compareTo(Integer.valueOf(b));
            }
        });
    }

}
