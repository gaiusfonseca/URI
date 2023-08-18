import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int productId = scanner.nextInt();
        int quantity = scanner.nextInt();
        ArrayList<Snack> snacks = new ArrayList<Snack>(5);

        snacks.add(new Snack(1, "Cachorro Quente", 4.00));
        snacks.add(new Snack(2, "X-salada", 4.50));
        snacks.add(new Snack(3, "X-bacon", 5.00));
        snacks.add(new Snack(4, "Torrada Simples", 2.00));
        snacks.add(new Snack(5, "Refrigerante", 1.50));

        snacks.forEach(snack -> {
            if(snack.getId() == productId){
                System.out.printf("Total: R$ %.2f%n", snack.getPrice() * quantity);
            }
        });
    }
}

class Snack{

        private int id;
        private String specification;
        private double price;

        Snack(int id, String specification, double price){
            this.id = id;
            this.specification = specification;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
