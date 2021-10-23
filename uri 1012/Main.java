
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //declara as variáveis que aramzenam os valores de entrada
        double numberA = input.nextDouble();
        double numberB = input.nextDouble();
        double numberC = input.nextDouble();

        //cria um objeto de cada tipo, utilizando as intruções do problema
        //triangulo A = base C = altura
        Triangle triangle = new Triangle(numberA, numberC);

        //circulo C = raio
        Circle circle = new Circle(numberC);

        //trapezio de A = base maior, B = base menor, C = altura
        Trapeze trapeze = new Trapeze(numberA, numberB, numberC);

        //quadrado de B = lado
        Rectangle square = new Rectangle(numberB, numberB);

        //retangulo de A = base, B = altura
        Rectangle rectangle = new Rectangle(numberA, numberB);

        Shape[] list = {triangle, circle, trapeze, square, rectangle};

        for(Shape shape : list){
            shape.showArea();
        }
    }
}

abstract class Shape{

    public abstract double area();

    public abstract void showArea();

}

class Triangle extends Shape{

    private double base;
    private double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return getBase() * getHeight() / 2;
    }

    @Override
    public void showArea(){
        System.out.printf("TRIANGULO: %.3f%n", area());
    }
}

class Circle extends Shape{

    private static final double PI = 3.14159;
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void showArea(){
        System.out.printf("CIRCULO: %.3f%n", area());
    }
}

class Trapeze extends Shape{

    private double majorBase;
    private double minorBase;
    private double height;

    Trapeze(double majorBase, double minorBase, double height){
        this.majorBase = majorBase;
        this.minorBase = minorBase;
        this.height = height;
    }

    public double getMajorBase() {
        return majorBase;
    }

    public void setMajorBase(double majorBase) {
        this.majorBase = majorBase;
    }

    public double getMinorBase() {
        return minorBase;
    }

    public void setMinorBase(double minorBase) {
        this.minorBase = minorBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return (getMajorBase() + getMinorBase()) * getHeight() / 2;
    }

    @Override
    public void showArea(){
        System.out.printf("TRAPEZIO: %.3f%n", area());
    }
}

class Rectangle extends Shape{

    private double base;
    private double height;

    Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area(){
        return getBase() * getHeight();
    }

    @Override
    public void showArea(){
        
        if(getBase() == getHeight()){
            System.out.printf("QUADRADO: %.3f%n", area());
        }else{
            System.out.printf("RETANGULO: %.3f%n", area());
        }
    }
}