
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        //instâcnia um Scanner para capturar as entradas dos usuários
        Scanner input = new Scanner(System.in);

        //cria uma nova esfera
        Sphere sphere = new Sphere(input.nextDouble());

        //exibe o volume
        sphere.displayVolume();
    }
}

class Sphere{

    private static final double CONST_FACTOR = 3.14159 * 4 / 3 ;
    private double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume(){
        return CONST_FACTOR * Math.pow(radius, 3);
    }

    public void displayVolume(){
        System.out.printf("VOLUME = %.3f%n", getVolume());
    }

}