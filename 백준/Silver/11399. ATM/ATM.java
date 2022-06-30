import java.util.*;

class Main {
	public static int solution(int[] arr) {
		int ans = 0, sum = 0;
		Arrays.sort(arr);
		for (int time: arr) {
			sum += time;
			ans += sum;
		}
		return ans;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	System.out.println(solution(arr));
	}
}