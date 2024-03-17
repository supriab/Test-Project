package Polimorphism;

import java.util.HashMap;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<>();

        name.put("red", 1);
        name.put("blue", 2);
        name.put("green", 3);
        name.put("black", 4);

        for (String j : name.keySet()) {
            System.out.println(j);
            System.out.println(name.get(j));
        }

    }
}