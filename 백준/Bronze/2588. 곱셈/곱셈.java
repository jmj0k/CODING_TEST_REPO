import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fnum = scanner.nextInt();
		int snum = scanner.nextInt();
		String[] snums = String.valueOf(snum).split("");
		for (int j = snums.length - 1; j >= 0; j--) {
			System.out.println(fnum * Integer.parseInt(snums[j]));
		}
		System.out.println(snum * fnum);
    }
}