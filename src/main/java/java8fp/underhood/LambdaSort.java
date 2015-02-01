package java8fp.underhood;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class LambdaSort {

    public void sortByDifference(String[] arr, int origo) {
        Arrays.sort(arr, (a, b) ->
                Integer.valueOf(Math.abs(parseInt(a) - origo))
                        .compareTo(Math.abs(parseInt(b) - origo)));
    }

}
