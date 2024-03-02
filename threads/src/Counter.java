import java.util.ArrayList;
import java.util.List;

public class Counter implements Runnable {
    List<Integer> list;
    public static List<Integer> evens = new ArrayList<>();
    public static List<Integer> odds = new ArrayList<>();

    public Counter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for(Integer number : list){
            add(number);
        }
    }

    synchronized void add(int number){
        if(number%2==0){
            System.out.println(Thread.currentThread().getName() + " -> " + number);
            evens.add(number);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " -> " + number);
            odds.add(number);
        }
    }
}
