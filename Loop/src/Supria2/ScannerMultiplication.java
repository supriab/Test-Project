package Supria2;

import java.util.Scanner;

public class ScannerMultiplication {

    //Print Multiplication table of any number.
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("input");
    int number = scanner.nextInt();

    for (int i = 1; i <=12; i++){
            System.out.println(number + "*" + i + "=" + i*number);
        }




    }
}
