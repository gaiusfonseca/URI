import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

    Scanner teclado = new Scanner(System.in);

    int notas, valor;

    valor = teclado.nextInt();

    notas = (valor / 100);
        valor %= 100;
    System.out.println(notas+ " nota(s) de R$ 100,00");    

    notas = (int) (valor / 50);
        valor %= 50;
    System.out.println(notas+ " nota(s) de R$ 50,00");  

    notas = (int) (valor / 20);
        valor %= 20;
    System.out.println(notas+ " nota(s) de R$ 20,00");

    notas = (int) (valor / 10);
        valor %= 10;
    System.out.println(notas+ " nota(s) de R$ 10,00"); 

    notas = (int) (valor / 5);
        valor %= 5;
    System.out.println(notas+ " nota(s) de R$ 5,00");     

    notas = (int) (valor / 2);
        valor %= 2;
    System.out.println(notas+ " nota(s) de R$ 2,00"); 

    notas = (int) (valor / 1);
        valor %= 1;
    System.out.println(notas+ " nota(s) de R$ 1,00"); 

}