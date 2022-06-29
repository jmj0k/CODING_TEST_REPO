import java.util.*;

class Main {
	public static int solution(int[] arr, int money) {
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (money < arr[i]) continue;
			count += money / arr[i];
			money %= arr[i];
		}
		return count;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int money = sc.nextInt();
    	int[] arr = new int[n];
    	for (int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
    	}
    	
    	System.out.println(solution(arr, money));
	}
}