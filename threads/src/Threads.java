import java.util.ArrayList;

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<ArrayList<Integer>> parts = new ArrayList<>();

        for(int i = 1; i <= 10000; i++ ){
            numbers.add(i);
        }
        for(int i = 0; i < 4; i++){
            ArrayList<Integer> part = new ArrayList<>(numbers.subList(i*2500,(i+1)*2500)) ;
            parts.add(part);
        }

        Counter c1 = new Counter(parts.get(0));
        Counter c2 = new Counter(parts.get(1));
        Counter c3 = new Counter(parts.get(2));
        Counter c4 = new Counter(parts.get(3));

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("ODDS: " + Counter.odds.stream().sorted().toList());
        System.out.println("EVENS: " + Counter.evens.stream().sorted().toList());
    }
}
