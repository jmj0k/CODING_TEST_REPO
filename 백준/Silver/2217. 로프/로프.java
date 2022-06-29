import java.util.*;

class Main {
	public static int solution(int[] arr) {
		Arrays.sort(arr);
		int maxWeight = 0; 
		for (int i = 1; i <= arr.length; i++) {
			maxWeight = Math.max(maxWeight, arr[arr.length - i] * i);
		}
		return maxWeight;
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