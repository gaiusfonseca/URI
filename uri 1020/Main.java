
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        input.close();
    
        Age age = new Age(days);
        System.out.println(age);
    }
}

class Age{

    private int year;
    private int month;
    private int day;

    public Age(int days){
        if(days < 0){
            throw new IllegalArgumentException("a sua ideda em dias deve ser superior ou igual a 0.");
        }

        year = days / 365;
        days %= 365;
        
        month = days / 30;
        days %= 30;

        day = days;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString(){
        return String.format("%d ano(s)%n%d mes(es)%n%d dia(s)", getYear(), getMonth(), getDay());
    }

}