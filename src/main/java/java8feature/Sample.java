package main.java.java8feature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by ramesh on 26/06/17.
 */
public class Sample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4);
        List<String> strValues = Arrays.asList("a","b","c");

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        values.forEach(integer -> System.out.println(integer));

        values.forEach(System.out::println);

        strValues.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
