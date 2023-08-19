
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double notaExame = 0;
        double mediaFinal = 0;
        final int[] PESOS = {2, 3, 4, 1};

        
        for(int i = 0; i < notas.length; i++){
            notas[i] = scanner.nextDouble();
        }

        printMedia(media(notas, PESOS));

        if(isInExam(media(notas, PESOS))){
            notaExame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            mediaFinal = (media(notas, PESOS) + notaExame) / 2;

            if(mediaFinal >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
        scanner.close();
    }

    public static double media(double[] notas, int[] pesos){
        int totalPesos = Arrays.stream(pesos).sum();
        double totalNotas = 0;

        for(int i = 0; i < notas.length; i++){
            totalNotas = totalNotas + notas[i] * pesos[i];
        }

        return Math.floor(totalNotas / totalPesos * 10) / 10;
    }

    public static void printMedia(double media){
        System.out.printf("Media: %.1f%n", media);

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");
        }
    }

    public static boolean isInExam(double media){
        if(media >= 5 && media < 7){
            return true;
        }

        return false;
    }
}