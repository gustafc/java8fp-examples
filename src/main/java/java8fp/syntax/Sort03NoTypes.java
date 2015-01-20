package java8fp.syntax;

import java.util.Arrays;

import static java8fp.Comparisons.compareAlphanumeric;

public class Sort03NoTypes {

    public static void main(String[] args) {
        Arrays.sort(args, (a, b) -> {
            return compareAlphanumeric(a, b);
        });
        for (String s : args) System.out.println(s);
    }

}
