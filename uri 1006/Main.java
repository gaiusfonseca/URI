
/**
 * @author Gaius Fonseca
 * URI 1006
 */

 import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //declara as variáveis que irão armazenar as entradas dos usuários
        double gradeA = input.nextDouble();
        double gradeB = input.nextDouble();
        double gradeC = input.nextDouble();

        //exibe o resultadod final
        System.out.printf("MEDIA = %.1f%n", average(gradeA, gradeB, gradeC));
    }

    public static double average(double gradeA, double gradeB, double gradeC) {
        
        //parametriza o cálculo da média ponderada
        final int MAX_SCORE = 10;
        final int WHEIGHT_A = 2;
        final int WHEIGHT_B = 3;
        final int WHEIGHT_C = 5;

        return (gradeA * WHEIGHT_A + gradeB * WHEIGHT_B + gradeC * WHEIGHT_C) / MAX_SCORE;
    }
 }