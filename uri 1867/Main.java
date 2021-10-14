import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        double n, m;
        Scanner input = new Scanner(System.in);

        n = input.nextDouble();
        m = input.nextDouble();

        while(n != 0 || m != 0){
            System.out.printf("%.0f%n", compare(toOneDigit(n), toOneDigit(m)));
            n = input.nextDouble();
            m = input.nextDouble();
        }

        input.close();
    }

    public static double compare(double n, double m) {
        
        if(n == m){
            return 0;
        }else if(n > m){
            return 1;
        }else{
            return 2;
        }
    }

    public static int toOneDigit(double number) {
        
        double base = 1;
        double total = 0;
        double rest;

        //identifica o algarimos de maior ordem
        while( number / base >= 1){
            base *= 10;
            //10    10
            //100   100
            //1000  1000
        }

        //inicializa o resto com o próprio algarismo
        rest = number % base;
        //123   222

        while(rest > 0){
            //decrementa a base em uma ordem
            base /= 10;
            //100   100
            //10    10
            //1     1

            //seleciona o algarismo de maior ordem (sempre será um número entre 0 e 9)
            total = total + (int) (rest / base);
            //1 2
            //3 4
            //6 6

            //prepara o resto para a próxima iteração
            rest = rest % base;
            //23    //22
            //3     //2
            //0     //0
        }

        //enquanto total for maior que 9, repete os passos anteriores
        while(total >= 10){
            total = toOneDigit(total);
        }

        return (int) total;
    }
}