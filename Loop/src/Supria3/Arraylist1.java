package Supria3;

import java.util.ArrayList;

public class Arraylist1 {

    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        c.add(2);
        c.add(4);
        c.add(6);
        c.add(8);
        c.add(5);
        c.add(4);
        System.out.println(c.size());
        System.out.println(c.get(1));

        for(int k = 0; k< c.size(); k++){
            System.out.println(c.get(k));

        }


    }
}
