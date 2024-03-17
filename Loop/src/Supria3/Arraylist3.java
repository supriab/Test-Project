package Supria3;

public class Arraylist3 {
    public static void main(String[] args){
        //String

        int i = 10;
        double b = 10.5;
        char f = 's';
        String a = "abd";
        String d = "Hello world, I am learning java";


        System.out.println(d.length());
        System.out.println(a.length());
        System.out.println(d.charAt(11));
        System.out.println(d.contains("hello"));
        System.out.println(d.contains("Hello"));
        System.out.println(d.toUpperCase());
        System.out.println(d.substring(1, 10));

        String[] e = d.split(" ");
        String[] k = a.split("");
        System.out.println(e.length);


        for (int j = 0; j< e.length; j++){

            System.out.println(e[j]);

        }


    }

}
