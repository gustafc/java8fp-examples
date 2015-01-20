package java8fp;

import java.math.BigDecimal;
import java.util.Optional;

public class Comparisons {

    public static final int LESS_THAN = -1, EQUALS = 0, GREATER_THAN = 1;

    private static Optional<BigDecimal> parse(String s){
        try {
            return Optional.of(new BigDecimal(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public static int compareAlphanumeric(String a, String b) {
        Optional<BigDecimal> x = parse(a), y = parse(b);
        return x.map(xv ->
                    y.map(yv -> xv.compareTo(yv)).orElse(LESS_THAN))
                .orElseGet(() ->
                        y.map(yv -> GREATER_THAN).orElseGet(() ->
                                a.compareTo(b)));
    }
}
