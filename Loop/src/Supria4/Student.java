package Supria4;

public class Student {

    public static void main(String[] args) {
        One one = new One();
        Three three = new Three();

        System.out.println(one.a);
        System.out.println(one.a);

        Two two = new Two();
        System.out.println(two.i);
        System.out.println(two.j);
        System.out.println(two.k);

        //sum of i and J
        System.out.println(two.i + two.j);
        System.out.println(two.i + one.a + two.k);
    }

    }

