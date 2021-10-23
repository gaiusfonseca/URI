
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);

        //instância um novo employee
        Employee employee = new Employee(input.nextInt(), input.nextInt(), input.nextFloat());

        //exibe pos dados do employee
        System.out.print(employee);
    }
}

class Employee{
    
    private int id;
    private int workedHours;
    private float hourSalary;

    Employee(int id, int workedHours, float hourSalary ){
        this.id = id;
        this.workedHours = workedHours;
        this.hourSalary = hourSalary;
    }

    public int getId(){
        return id;
    }

    public int getWorkedHours(){
        return workedHours;
    }

    public float getSalary(){
        return workedHours * hourSalary;
    }

    public String toString(){
        return String.format("NUMBER = %d%nSALARY = U$ %.2f%n", getId(), getSalary());
    }
}