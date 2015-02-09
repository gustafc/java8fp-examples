package java8fp.syntax;

import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class SpecialCases {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running!");
        ActionListener a = e -> System.out.println(e);
        // vs.
        ActionListener b = System.out::println;

        Function<String, Integer> lengthOfString = String::length;
        assert lengthOfString.apply("hej") == 3;

        Function<Long, Date> timestampToDate = Date::new;
    }

}

class Foo {

    public Supplier<Foo> makeSupplier() {
        return () -> this;
    }

}