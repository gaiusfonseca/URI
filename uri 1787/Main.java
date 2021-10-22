//uri 1787
import java.util.Scanner;

class Main{

    //intância um Scanner para capturar a entrada do usuário
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        int rounds;             //armazena a quantidade de rodadas informada pelo usuário
        
        //solicita a quantidade de rodadas
        rounds = requestRounds();
        
        //repete enquanto o usuário não digitar zero
        while(rounds != 0){
            
            //instância os participantes do jogo
            Person uilton = new Person("Uilton");
            Person rita = new Person("Rita");
            Person ingrid = new Person("Ingrid");
            
            //prepara um array de Pessoas para facilitar a manipulação
            Person[] players = {uilton, rita, ingrid};
            
            Person bigger;          //armazena uma referência à pessoa que deu o maior palpite
            Person winner;          //armazena uma referência à pessoa que venceu no conjunto das rodadas
            
            //executa as rodadas
            for(int lap = 0; lap < rounds; lap++){
    
                //solicita o palpite dos jogadores
                System.out.print("informe o palpite de uilton, rita e ingrid: ");
                for(int i = 0; i < players.length; i++){
                    players[i].setGuess(input.nextInt());
                }
    
                //verifica se o palpite é uma potência de 2, se for, adiciona um ponto
                for(int i = 0; i < players.length; i++){
                    if(players[i].isPower(players[i].getGuess())){
                        players[i].addPoints();
                    }
                }
    
                //seleciona o maior palpite dentre todos
                bigger = max(uilton, rita, ingrid);
                
                //verifica se o maior palpite é uma potência de 2, se for, atribui um ponto
                if(bigger.isPower(bigger.getGuess())){
                    bigger.addPoints();
                }
            }

            //seleciona o vencedor
            winner = getWinner(players);
    
            if(winner.getName().equals("URI")){
                System.out.println("URI");
            }else if(winner.getPoints() == 0){
                
            }else{
                //imprime o nome do vencedor
                System.out.printf("%s%n", winner.getName());
            }

            //pergunta se deseja seguir para uma próxima rodada
            rounds = requestRounds();
        }

    }

    public static Person getWinner(Person... players) {
        
        
        Person winner = players[0];  //pressupõe que uilton é o vencedor
        int count = 0;              //conta quantas pessoas tem uma pontuação igual a do vencedor
    
        //seleciona aquele que obteve a maior pontuação
        for(int i = 0; i < players.length; i++){
            if(winner.getPoints() < players[i].getPoints()){
                winner = players[i];
            }
        }
    
        //conta quantas pessoas tiveram a pontuação igual a do vencedor
        for(int i = 0; i < players.length; i++){
            if(winner.getPoints() == players[i].getPoints()){
                count++;
            }
        }
    
        //se mais de uma pessoa obteve uma pontuação igual a maior pontuação, deu URI
        if(count > 1){
            Person uri = new Person("URI");
            return uri;
        }else{
            return winner;
        }
    }
    
    
    public static Person max(Person... players) {
        
        //assume que uilton foi o maior palpite
        Person bigger = players[0];
    
        //itera pelas pessoas comparando o valor do palpite
        for(int i = 0; i < players.length; i++){
            
            //se a iteração atual for maior que bigger, bigger pega uma referência a essa pesssoa
            if(bigger.getGuess() < players[i].getGuess()){
                bigger = players[i];
            }
        }
    
        return bigger;
    }
    
    /**
     * Solicita ao usuário que informe um número de rodadas e retorna o inteiro positivo informado pelo usuário.
     * @return Um inteiro positivo informado pelo usuário.
     */
    public static int requestRounds(){
    
        int number;
    
        //repete enquando o usuário informar um valor inválido
        do{
            System.out.println("0 - Sair");
            System.out.print("informe o número de rodadas: ");
            number = input.nextInt();
    
            if(number == 0){
                break;
            }
        }while(number < 0);
    
        return number;
    }
}

class Person{

    private String name;
    private int guess;
    private int points;

    public Person(String name){
        this.name = name;
        this.guess = 0;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public void addPoints() {
        this.points++;
    }

    public boolean isPower(int number) {
        
        boolean isPower = false;

        while(number % 2 == 0 && number > 1){
            number = number / 2;
        }

        isPower = number == 1 ? true : false; 

        return isPower;
    }

    @Override
    public String toString(){
        return String.format("name: %s, guess: %d, points: %d", this.getName(), this.getGuess(), this.getPoints());
    }
}