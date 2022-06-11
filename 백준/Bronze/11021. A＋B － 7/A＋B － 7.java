import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            String str = "Case #" + i + ": " 
                + (scanner.nextInt() + scanner.nextInt());
            System.out.println(str);
        }
    }
}