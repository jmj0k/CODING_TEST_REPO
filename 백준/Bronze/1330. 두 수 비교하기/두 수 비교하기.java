import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
        String sign = A > B ? ">" : B == A ? "==" : "<";
		System.out.println(sign);
    }
}    