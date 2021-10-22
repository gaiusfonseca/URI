
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        //declara dois inteiros para armazenar as entradas do usuário
        int number1, number2;

        //captura as entradas do usuário
        number1 = input.nextInt();
        number2 = input.nextInt();

        //exibe o valor do produto
        System.out.printf("PROD = %d%n", number1 * number2);

    }
}