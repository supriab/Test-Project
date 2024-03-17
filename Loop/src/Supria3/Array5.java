package Supria3;

public class Array5 {
    public static void main(String[] args) {

        int[] a = {2, 4, 6, 8};
        //replace the value
        a[1] = 20;

        for(int i= 0; i < a.length; i++) {
            System.out.println(a[i]);

            //another way to create array
            int[] b = new int[4];
            b[0] = 2;
            b[1] = 4;
            b[2] = 6;
            b[3] = 8;

            for(int j = 0; j < b.length; j++){
                System.out.println(b[j]);


            }

        }

    }

}
