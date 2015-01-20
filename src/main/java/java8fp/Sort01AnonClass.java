package java8fp;

import java.util.Arrays;
import java.util.Comparator;

import static java8fp.Comparisons.compareAlphaNumeric;

public class Sort01AnonClass {

    public static void main(String[] args) {
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return compareAlphaNumeric(a, b);
            }
        });
        for (String s : args) System.out.println(s);
    }

}
