package java8fp.syntax;

import java.util.Arrays;

import static java8fp.Comparisons.compareAlphanumeric;

public class Sort04SlimmestLambda {

    public static void main(String[] args) {
        Arrays.sort(args, (a, b) -> compareAlphanumeric(a, b));
        for (String s : args) System.out.println(s);
    }

}
