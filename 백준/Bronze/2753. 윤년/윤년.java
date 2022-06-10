import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
	    int sign = 
            (((year % 4 == 0) && (year % 100 != 0))
            || (year % 400 == 0)) ? 1 : 0;
        System.out.println(sign);
    }
}