
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //declara a eficiência do veículo como uma constante
        final int EFFICIENCY = 12;

        //armazena as entradas do usuário
        int duration = input.nextInt();
        int speed = input.nextInt();

        System.out.printf("%.3f%n", fuel(distance(duration, speed), EFFICIENCY));
    }

    /**
     * Calcula a distância a partir da duração da viagem e velocidade média.
     * @param duration A duração da viagem em horas.
     * @param speed A velocidade média em Km/h.
     * @return A distância em Km.
     */
    public static int  distance(int duration, int speed) {
        return duration * speed;
    }

    /**
     * Calcula a quantidade de combustível em l, dada a distância da viagem em km e o rendimento do veículo.
     * @param distance A distância a percorrer em Km.
     * @param efficiency O rendimento do veículo
     * @return A quantidade de combustível em l.
     */
    public static double fuel(int distance, int efficiency) {
        return (double) distance / efficiency;
    }
}