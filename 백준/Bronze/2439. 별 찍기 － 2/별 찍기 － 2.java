import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
         for (int i = N - 1; i >= 0; i--) {
             String str = " ".repeat(i) + "*".repeat(N - i);
             System.out.println(str);
         }
     }
}