
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();
        double fuel = input.nextDouble();

        displayEfficiency(distance, fuel);
    }

    public static double efficiency(int distance, double fuel) {
        return distance / fuel;
    }

    public static void displayEfficiency(int distance, double fuel) {
        System.out.printf("%.3f km/l%n", efficiency(distance, fuel));
    }
}