import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        boolean statement1 = b > c && d > a;    //se B for maior do que C e se D for maior do que A
        boolean statement2 = c + d > a + b;     //a soma de C com D for maior que a soma de A e B
        boolean statement3 = c > 0 && d > 0;    //se C e D, ambos, forem positivos
        boolean statement4 = a % 2 == 0;        //se a variável A for par

        if(statement1 && statement2 && statement3 && statement4){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }

    }

}