
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        String message = "Fora de intervalo";

        ArrayList<MyRange> ranges = new ArrayList<MyRange>(4);

        ranges.add(new MyRange(0, true, 25, true));
        ranges.add(new MyRange(25, false, 50, true));
        ranges.add(new MyRange(50, false, 75, true));
        ranges.add(new MyRange(75, false, 100, true));

        for(MyRange range : ranges){
            if(range.isInRange(value)){
                message = String.format("Intervalo %s", range);
            }
        }

        System.out.println(message);
    }
}

class MyRange{

    private int start;
    private boolean includeStart;
    private int end;
    private boolean includeEnd;

    MyRange(int start, boolean includeStart, int end, boolean includeEnd){
        this.start = start;
        this.includeStart = includeStart;
        this.end = end;
        this.includeEnd = includeEnd;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public boolean isStartIncluded() {
        return includeStart;
    }

    public void setIncludeStart(boolean includeStart) {
        this.includeStart = includeStart;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public boolean isEndIncluded() {
        return includeEnd;
    }

    public void setIncludeEnd(boolean includeEnd) {
        this.includeEnd = includeEnd;
    }

    public boolean isInRange(double value){

        boolean isAfterStart = false;
        boolean isBeforeEnd = false;


        if(isStartIncluded()){
            isAfterStart = value >= getStart();
        }else{
            isAfterStart = value > getStart();
        }

        if(isEndIncluded()){
            isBeforeEnd = value <= getEnd();
        }else{
            isBeforeEnd = value < getEnd();
        }


        return isAfterStart && isBeforeEnd;
    }

    @Override
    public String toString(){
        String simbolOpen;
        String simbolClose;

        if(isStartIncluded()){
            simbolOpen = "[";
        }else{
            simbolOpen = "(";
        }

        if(isEndIncluded()){
            simbolClose = "]";
        }else{
            simbolClose = ")";
        }

        return String.format("%s%d,%d%s", simbolOpen, getStart(), getEnd(), simbolClose);
    }
}