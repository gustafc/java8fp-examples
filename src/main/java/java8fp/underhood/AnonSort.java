package java8fp.underhood;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class AnonSort {

    public void sortByDifference(String[] arr, int origo) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.valueOf(Math.abs(parseInt(a) - origo))
                        .compareTo(Math.abs(parseInt(b) - origo));
            }
        });
    }

}
