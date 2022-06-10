import java.util.*;
public class Main {
	static final int DIVIDE_MIN = 60;
	static final int DIVIDE_HOUR = 24;
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = scanner.nextInt();
        int min = scanner.nextInt() + scanner.nextInt();
        hour = ((min / DIVIDE_MIN) + hour) % DIVIDE_HOUR;
        min = min % DIVIDE_MIN;
        String time = hour + " " + min;
        System.out.println(time);
    }
}