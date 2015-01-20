package java8fp.syntax;

import java8fp.Comparisons;

import java.util.Arrays;

public class Sort05MethodReference {

    public static void main(String[] args) {
        Arrays.sort(args, Comparisons::compareAlphanumeric);
        for (String s : args) System.out.println(s);
    }

}
