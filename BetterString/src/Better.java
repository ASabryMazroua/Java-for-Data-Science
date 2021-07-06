import java.util.Arrays;
import java.util.Collections;

public class Better{

    public static void main(String[] args) {
        StringUtils.betterString("Hello", "Hello World", (string1, string2) -> true);
        StringUtils.betterString("Hello", "Hello World", (string1, string2) -> string1.length() > string2.length());
    }
}

class StringUtils{

    public static void betterString(String s1, String s2,
                                    CompareTwoStrings predicate) {
        if (predicate.isBetter(s1, s2)) {
            System.out.println("\nFirst string is better");
        } else {
            System.out.println("\nSecond string is better");
        }
    }
}

@FunctionalInterface
interface CompareTwoStrings {
    boolean isBetter(String s1, String s2);
}
