import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
        int min = scanner.nextInt() - 45;
        hour = min >= 0 ? hour : hour == 0 ? 23 : hour - 1;
        min = min >= 0 ? min : 60 + min;
        String time = hour + " " + min;
        System.out.println(time);
    }
}