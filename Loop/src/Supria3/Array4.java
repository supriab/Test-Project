package Supria3;

public class Array4 {

    public static void main(String[] args) {
        int[] a = {1, 9, 3, 4, 5, 3, 7, 8, };
        System.out.println(a.length);
        //multiple element
        //0 1 3 6 10 15.....
        //Length represents number of element
        //index number 0 - a,length-1
        //for loop

        System.out.println(0);
        System.out.println(a[0]);

        for(int i = 0; i<= a.length - 1; i++){
            System.out.println(a[i]);

            int sum = 0;

            for(int j = 0; j<= a.length -1; j++){
                sum = sum + a[j];
            }
            System.out.println(sum);
            System.out.println("the sum is:" + sum);
            System.out.println("the avarage is;" + sum/a.length);

        }

    }
}
