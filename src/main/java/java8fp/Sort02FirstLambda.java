package java8fp;

import java.util.Arrays;

import static java8fp.Comparisons.compareAlphaNumeric;

public class Sort02FirstLambda {

    public static void main(String[] args) {
        Arrays.sort(args, (String a, String b) -> {
            return compareAlphaNumeric(a, b);
        });
        for (String s : args) System.out.println(s);
    }

}
