import java.util.*;
class Main {
	public static int solution(int[] arr, int m, int n) {
		int count = 0;
		int st = 0, en = 0, sum = 0;
		while (st < n) {
			if (en == n) break;
			sum += arr[en++];
			while (sum > m) {
				sum -= arr[st];
				st++;
			}
			if (sum == m) count++;
		}
		return count;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[] arr = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	System.out.println(solution(arr, m, n));
	}
}