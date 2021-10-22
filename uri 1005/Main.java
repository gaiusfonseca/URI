
/**
 * @Author Gaius Fonseca
 * URI 1005
 */

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //declara dois doubles para armazenar as entradas do usuário
        double grade1, grade2;

        //incializa a média
        double average = 0;

        //configura os pesos
        final double WHEIGT1 = 3.5;
        final double WHEIGT2 = 7.5;

        //captura as eentradas do usuário
        grade1 = input.nextDouble();
        grade2 = input.nextDouble();

        average = (WHEIGT1 * grade1 + WHEIGT2 * grade2) / 11;

        System.out.printf("MEDIA = %.5f%n", average);
    }
}
