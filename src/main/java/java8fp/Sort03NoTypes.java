package java8fp;

import java.util.Arrays;

import static java8fp.Comparisons.compareAlphaNumeric;

public class Sort03NoTypes {

    public static void main(String[] args) {
        Arrays.sort(args, (a, b) -> {
            return compareAlphaNumeric(a, b);
        });
        for (String s : args) System.out.println(s);
    }

}
