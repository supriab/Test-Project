package Polimorphism;

public class Ex1 {
    public static void main(String[] args) {

        String[] flowers = {"rose","Lily","Dahlia","Camellia","Tulip"};

        System.out.println(flowers.length);
        System.out.println(flowers[3]);
        System.out.println(flowers[1]);
        System.out.println(flowers[2]);

        try {
            System.out.println(flowers[8]);
        } catch (Exception e){
            System.out.println("Exception is detected");
        }
        try {
            System.out.println(6/2);
        } catch (Exception e){
            System.out.println("that operation is not permitted");
        }


        System.out.println(flowers[0]);

    }
}
