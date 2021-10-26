
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //declara três inteiros para armazenar as entradas do usuário
        int numberA = input.nextInt();
        int numberB = input.nextInt();
        int numberC = input.nextInt();

        System.out.printf("%d eh o maior%n", max(numberA, max(numberB, numberC)));

    }

    /**
     * Identifica o maior valor entre dois números inteiros
     * @param numberA Um número inteiro.
     * @param numberB Outro número inteiro.
     * @return O maior entre dois inteiros.
     */
    public static int max(int numberA, int numberB){
        return (numberA + numberB + Math.abs(numberA - numberB)) / 2;
    }
}