import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        
        //instância um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        int laps;           //armazena o número de entradas (pokemons) a serem informadas pelo usuário
        Pokemon poke;       //armazena uma referência ao pokemon que está sendo processado

        //solicita ao usuário que informe o número de entradas a serem processadas
        laps = input.nextInt();

        Pokemon[] myMonsters = new Pokemon[laps];

        //processa as entradas
        for(int i = 0; i < laps; i++){
            poke = new Pokemon(input.next(), input.nextInt());
            poke.setVitalityParams(input.nextInt(), input.nextInt(), input.nextInt());
            poke.setAttackParams(input.nextInt(), input.nextInt(), input.nextInt());
            poke.setDefenseParams(input.nextInt(), input.nextInt(), input.nextInt());
            poke.setSpeedParams(input.nextInt(), input.nextInt(), input.nextInt());

            myMonsters[i] = poke;
        }

        for(int i = 0; i < myMonsters.length; i++){
            System.out.printf("Caso #%d: %s nivel %d%n", i + 1, myMonsters[i].getSpecie(), myMonsters[i].getLevel());
            System.out.printf("HP: %d%n", myMonsters[i].getVitality());
            System.out.printf("AT: %d%n", myMonsters[i].getAttack());
            System.out.printf("DF: %d%n", myMonsters[i].getDefense());
            System.out.printf("SP: %d%n", myMonsters[i].getSpeed());
        }
    }
}

class Pokemon{

    private int level;
    private String specie;
    private int[] vitalityParams;
    private int[] attackParams;
    private int[] defenseParams;
    private int[] speedParams;

    public Pokemon(String specie, int level){
        this.specie = specie;
        this.level = level;
    }

    public int getVitality(){
        int hp;
        hp = (int) ((vitalityParams[1] + vitalityParams[0] + Math.sqrt(vitalityParams[2])/8 + 50) * level) / 50 + 10;
        return hp;
    }

    public int getAttack(){
        int attack;
        attack = (int) ((attackParams[1] + attackParams[0] + Math.sqrt(attackParams[2]) / 8) * level) / 50 + 5;
        return attack;
    }

    public int getDefense(){
        int defense;
        defense = (int) ((defenseParams[1] + defenseParams[0] + Math.sqrt(defenseParams[2]) / 8) * level) / 50 + 5;
        return defense;
    }

    public int getSpeed(){
        int speed;
        speed = (int) ((speedParams[1] + speedParams[0] + Math.sqrt(speedParams[2]) / 8) * level) / 50 + 5;
        return speed;
    }

    public String getSpecie(){
        return this.specie;
    }

    public int getLevel(){
        return this.level;
    }

    public void setVitalityParams(int... params){
        vitalityParams = params;
    }

    public void setAttackParams(int... params){
        attackParams = params;
    }

    public void setDefenseParams(int... params){
        defenseParams = params;
    }

    public void setSpeedParams(int... params){
        speedParams = params;
    }
}