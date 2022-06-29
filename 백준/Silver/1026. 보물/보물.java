import java.util.*;

class Main {
	public static int solution(int[] arr, int[] arr2) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			ans += arr[i] * arr2[(arr2.length - 1) - i];
		}
		return ans;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	int[] arr2 = new int[n];
    	for (int i = 0; i < n; i++) {
    		arr[i] = sc.nextInt();
    	}
    	for (int i = 0; i < n; i++) {
    		arr2[i] = sc.nextInt();
    	}
		Arrays.sort(arr);
		Arrays.sort(arr2);
    	System.out.println(solution(arr, arr2));
	}
}