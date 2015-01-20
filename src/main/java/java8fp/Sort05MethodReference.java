package java8fp;

import java.util.Arrays;

public class Sort05MethodReference {

    public static void main(String[] args) {
        Arrays.sort(args, Comparisons::compareAlphaNumeric);
        for (String s : args) System.out.println(s);
    }

}
