
//uri 1007

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        //declara um Scanner para capturar as entradas dos usuários
        Scanner input = new Scanner(System.in);

        //declara e inicializa as variáveis com as entradas dos usuários
        int numberA = input.nextInt();
        int numberB = input.nextInt();
        int numberC = input.nextInt();
        int numberD = input.nextInt();

        //exibe a diferença dos produtos
        System.out.printf("DIFERENCA = %d%n", numberA * numberB - numberC * numberD);
    }
}