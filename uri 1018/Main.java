import java.util.Locale;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
        
        //instância um Scanner para capturar as entradas dos usuários
        Scanner input = new Scanner(System.in);

        //declara um array para armazenar o valor das cédulas
        final int[] MONEY = {100, 50, 20, 10, 5, 2, 1};

        //declara um array para armazenar a quantidade de ntoas de cada tipo
        int[] quantity = new int[7];

        //armazena a entrada do usuário
        int value = input.nextInt();

        //contabiliza valor das notas
        int total = updateTotal(quantity, MONEY);
        
        if(value >= 0 || value <= 1000000){
            
            //para cada cédula, em sentido decrescente
            for(int i = 0; i < MONEY.length; i++){
                
                //verifica se o valor total em mãos é menor do que o valor pretendido e se for:
                while(total <= value){
                    
                    //incrementa a quantidade de cédulas do valor atual em 1
                    quantity[i]++;
                    //atualiza o valor total em mãos
                    total = updateTotal(quantity, MONEY);
                    
                    //se o valor total em mãos for maior que o valor pretendido
                    if(total > value){
                        //decrementa a quantidade de cédulas do valor atual
                        quantity[i]--;
                        //atualiza o valor total das cédulas em mãos
                        total = updateTotal(quantity, MONEY);
                        //passa para a próxima cédula
                        break;
                    }
                }
            }
        }


        //Mostra que o valor pretendido foi atingido com a menor combinação de cédulas
        displayArrangement(value, quantity, MONEY);
    }

    /**
     * Imprime a quantidade de cada uma das notas.
     * @param quantity um array que armazena a quantidade de cada uma das notas.
     * @param money um array que armazena o valor de cada uma das notas.
     */
    public static void displayArrangement(int value, int[] quantity, int[] money) {
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.printf("%d%n", value);

        for(int i = 0; i < money.length; i++){
            System.out.println(quantity[i] + " nota(s) de " + nf.format(money[i]));
        }
    }

    /**
     * Calcula o valor total a partir de dois arrays em que um contém os valores das notas e o outro contém a quantidade
     * de cada uma das cédulas.
     * @param quantity um array que armazena a quantidade de cada uma das notas.
     * @param money um array que armazena o valor de cada uma das notas.
     * @return o valor total dado pelo produto dos arrays.
     */
    public static int updateTotal(int[] quantity, int[] money) {
        int total = 0;

        for(int i = 0; i < money.length; i++){
            total += quantity[i] * money[i];
        }

        return total;
    }
}