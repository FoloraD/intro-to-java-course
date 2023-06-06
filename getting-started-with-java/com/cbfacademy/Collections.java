package com.cbfacademy;

//Main class
public class Collections {
    public static void main(String... args) {
        Set<Integer> integers_example = new LinkedHashSet<> ();
        System.out.println(integers_example.size());
        integers_example.add(1);
        integers_example.add(5);
        System.out.println(integers_example.size());

    };
}