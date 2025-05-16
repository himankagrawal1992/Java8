package Lambdas.BeforeLambdaExample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSort {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Kolkata");
        cities.add("Chennai");

        cities.sort(new LengthComparator());
        cities.stream().peek(System.out::println).collect(Collectors.toList());

    }
}
