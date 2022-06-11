import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        while (true) {
            int sum = scanner.nextInt() + scanner.nextInt();
            if (sum == 0) break;
            System.out.println(sum);
        }
     }
}