
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = getDelta(a, b, c);

        if(isInvalid(delta, a)){
            System.out.println("Impossivel calcular");
        }else{
            System.out.printf("R1 = %.5f%n", getFirstRoot(a, b, delta));
            System.out.printf("R2 = %.5f%n", getSecondRoot(a, b, delta));
        }
    }

    private static double getDelta(double a, double b, double c){
        return Math.pow(b, 2) - 4 * a * c;
    }

    private static boolean isInvalid(double delta, double a){
        return (delta < 0 || a == 0);
    }

    private static double getFirstRoot(double a, double b, double delta){
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    private static double getSecondRoot(double a, double b, double delta){
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}