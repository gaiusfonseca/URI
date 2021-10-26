
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        //instãncia um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //aramzena a distância informada pelo usuário
        int distance = input.nextInt();

        System.out.printf("%d minutos%n", timeToReach(distance));
    }

    /**
     * Calcula o tempo necessário para que a distância entre o Carro A e Carro B seja igual a distância informada.
     * @param distance um inteiro que representa a distância em km entre o Carro A e o Carro B
     * @return o tempo em minutos em que a distância entre o Carro A e o Carro B é igual a distância informada.
     */
    public static int timeToReach(int distance) {
        return distance * 2;
    }
}