package de.dekkerf190232.lambadas;

import java.util.Arrays;
import java.util.List;

public class HalloJavaMitForEach {

    public static void example1() {
        List<String> strings = Arrays.asList("Hallo", "Welt", "Howdy");
        for (String string : strings) {
            System.out.println(string);
        }
        strings.forEach(s -> System.out.println(s));
        strings.forEach(System.out::println);
    }

}
