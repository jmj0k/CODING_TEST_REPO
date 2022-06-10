import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
        int y = scanner.nextInt();
        int point = x > 0 && y > 0
            ? 1 : x > 0 && y < 0 
            ? 4 : x < 0 && y < 0 
            ? 3 : 2;
        System.out.println(point);
    }
}