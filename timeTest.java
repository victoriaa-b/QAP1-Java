
public class timeTest {
     public static void main(String[] args) {
        // 2 time objects
        time t1 = new time(19, 32, 10);
        time t2 = new time(12, 22, 20);

        
        t1.nextSecond();
        t2.previousSecond();

        // Display the times for t1 and t2 after increase and decrease 
        System.out.println("Time for t1 after nextSecond: " + t1.toString());
        System.out.println("Time for t2 after previousSecond: " + t2.toString());
    }
}
