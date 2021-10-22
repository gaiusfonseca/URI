//uri 1002

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        double pi = 3.14159;
        double r;

        Scanner input = new Scanner(System.in);

        r = input.nextDouble();

        System.out.printf("A=%.4f%n", pi * Math.pow(r, 2));
    }
}