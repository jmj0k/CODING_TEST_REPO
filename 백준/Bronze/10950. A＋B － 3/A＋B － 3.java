import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int sum = scanner.nextInt() + scanner.nextInt();
            System.out.println(sum);
        }
    }
}