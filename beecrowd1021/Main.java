
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int[] notes = {100, 50, 20, 10, 5, 2};
        int[] coins = {100, 50, 25, 10, 5, 1};

        int[] noteQuantities = new int[6];
        int[] coinQuantities = new int[6];

        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        int integerPart = getIntegerPart(value);
        int decimalPart = 0;

        for(int i = 0; i < 6; i++){
            noteQuantities[i] = breakValue(integerPart, notes[i]);
            integerPart = updateValue(integerPart, noteQuantities[i], notes[i]);
        }

        decimalPart = getDecimalPart(value, integerPart);

        for(int i = 0; i < 6; i++){
            coinQuantities[i] = breakValue(decimalPart, coins[i]);
            decimalPart = updateValue(decimalPart, coinQuantities[i], coins[i]);
        }

        for(int i = 0; i < 6; i++){
            if(i == 0){
                System.out.println("NOTAS:");
            }
            System.out.printf("%d nota(s) de R$ %.2f%n", noteQuantities[i], (double) notes[i]);
        }

        for(int i = 0; i < 6; i++){
            if(i == 0){
                System.out.println("MOEDAS:");
            }
            System.out.printf("%d moeda(s) de R$ %.2f%n", coinQuantities[i], (double) coins[i] / 100);
        }

        scanner.close();
    }

    private static int getIntegerPart(double value){
        return (int) Math.floor(value);
    }

    private static int getDecimalPart(double value, int integerPart){
        value =  (value - Math.floor(value)) * 100;
        value = value + integerPart * 100;
        return (int) value;
    }

    private static int breakValue(int value, int noteValue){
        int quantity = 0;

        while(value >= noteValue){
            quantity++;
            value -= noteValue;
        }

        return quantity;
    }

    private static int updateValue(int value, int quantity, int noteValue){
        return value - quantity * noteValue;
    }
}