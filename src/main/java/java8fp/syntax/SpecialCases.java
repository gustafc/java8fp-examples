package java8fp.syntax;

import java.awt.event.ActionListener;
import java.util.function.Supplier;

public class SpecialCases {

    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running!");
        ActionListener a = e -> System.out.println(e.getActionCommand());
    }

}
