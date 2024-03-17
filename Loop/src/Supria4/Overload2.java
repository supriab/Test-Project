package Supria4;

public class Overload2 {
    public static void main(String[] args) {
        Overload2 ref1 = new Overload2();
        ref1.sum(20.23,  10.45);
        ref1.sum(15, 35);
        ref1.sum(100,200,300);

    }

    void sum(double i, double b) {
        System.out.println(i +b);
    }
    void sum(int a, int e){

        System.out.println(a+e);
    }
    void sum(int m, int n ,int k){
        System.out.println(m+n+k);

    }



}
