package Supria3;

public class Array3 {

    public static void main(String[] args) {

        String[] name = {"Volvo", "BMW", "Ford", "Mazda","Toyota"};
        System.out.println(name.length);
        System.out.println(name[2]);
        System.out.println(name[4]);
        for (int i = 0; i <= name.length-1; i++){
            System.out.println(name[i]);
        }

    }
}
