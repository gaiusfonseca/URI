
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int seconds = input.nextInt();
        Time time = new Time(seconds);

        System.out.println(time);

    }
}

class Time{

    private int second;
    private int minute;
    private int hour;

    /**
     * Constrói um objeto time a partir um valor de seundos.
     * @param seconds o tempo em segundos a partir de um determinado instante.
     */
    public Time(int seconds){

        hour = seconds / 3600;
        seconds %= 3600;

        minute = seconds / 60;
        seconds %= 60;

        second = seconds;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    /**
     * Define o objeto Time para uma hora específica a partir de uma quantidade específica de segundos.
     * @param seconds o tempo em segundos a partir de um determinado instante.
     */
    public void setTime(int seconds){
        hour = seconds / 3600;
        seconds %= 3600;

        minute = seconds / 60;
        seconds %= 60;

        second = seconds;
    }

    @Override
    public String toString(){
        return String.format("%d:%d:%d", hour, minute, second);
    }
}