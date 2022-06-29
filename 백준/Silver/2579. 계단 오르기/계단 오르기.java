import java.util.*;

class Main {
	public static int solution(int[] arr) {
		if (arr.length < 2) return arr[0];
		
		int[][] score = new int[arr.length + 1][3];
		score[1][1] = arr[0];
		score[2][1] = arr[1];
		score[2][2] = score[1][1] + arr[1];
		
		for (int i = 2; i < arr.length; i++) {
			score[i + 1][1] = Math.max(score[i - 1][1], score[i - 1][2]) + arr[i];
			score[i + 1][2] = score[i][1] + arr[i];
		}
		return Math.max(score[arr.length][1], score[arr.length][2]);
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