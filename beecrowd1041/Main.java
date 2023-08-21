
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if(isOrigin(x, y)){
            System.out.println("Origem");
        }else if(isOnX(x, y)){
            System.out.println("Eixo X");
        }else if(isOnY(x, y)){
            System.out.println("Eixo Y");
        }else if(isOnQ1(x, y)){
            System.out.println("Q1");
        }else if(isOnQ2(x, y)){
            System.out.println("Q2");
        }else if(isOnQ3(x, y)){
            System.out.println("Q3");
        }else{
            System.out.println("Q4");
        }
    }

    public static boolean isOrigin(double x, double y){
        return x == 0 && y == 0;
    }

    public static boolean isOnX(double x, double y){
        return x != 0 && y == 0;
    }

    public static boolean isOnY(double x, double y){
        return x == 0 && y != 0;
    }

    public static boolean isOnQ1(double x, double y){
        return x > 0 && y > 0;
    }

    public static boolean isOnQ2(double x, double y){
        return x < 0 && y > 0;
    }

    public static boolean isOnQ3(double x, double y){
        return x < 0 && y < 0;
    }

    public static boolean isOnQ4(double x, double y){
        return x > 0 && y < 0;
    }
}