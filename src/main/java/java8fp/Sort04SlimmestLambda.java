package java8fp;

import java.util.Arrays;

import static java8fp.Comparisons.compareAlphaNumeric;

public class Sort04SlimmestLambda {

    public static void main(String[] args) {
        Arrays.sort(args, (a, b) -> compareAlphaNumeric(a, b));
        for (String s : args) System.out.println(s);
    }

}
