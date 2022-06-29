import java.util.*;

class Main {
	public static int solution(int n) {
		/*
		 * dp[n] = dp[n - 1] + dp[n - 2] + dp[n - 2];
		 * */
		
		if (n < 3) return n;
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for (int i = 3; i <= n; i++) {
			if (dp[i] == 0) dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]; 
		}
		return dp[n];
	}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for (int i = 0; i < t; i++) {
        	System.out.println(solution(sc.nextInt()));	
    	}
	}
}