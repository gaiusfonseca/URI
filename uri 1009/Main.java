
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        //intância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //cria um vendedor
        Seller seller = new Seller(input.next(), input.nextDouble(), input.nextDouble());

        //exibe o salário para os valores fornecidos
        seller.displaySalary();
    }
}

class Seller{

    private String name;
    private double salary;
    private double sales;
    private final double COMISSION;

    Seller(String name, double salary, double sales){
        this.name = name;
        this.salary = salary;
        this.sales = sales;
        COMISSION = 0.15;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getComission() {
        return COMISSION;
    }

    public double calculateSalary(){
        return getSalary() + getComission() * getSales();
    }
    
    public void displaySalary(){
        System.out.printf("TOTAL = R$ %.2f%n", calculateSalary());
    }
}