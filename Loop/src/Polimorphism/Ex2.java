package Polimorphism;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("java");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("python");
    }
}
