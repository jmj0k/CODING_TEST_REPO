import java.util.*;

class Main {
	public static int solution(int n) {
		/*
		 * 1로 만들기
		 * 3으로 나누어서 떨어지면 
		 * 2로 나누어서 떨어지면
		 * -1 
		 * */
		
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[1] = 0;
		
		for (int i = 2; i <= n; i++) {
			if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			dp[i] = Math.min(dp[i], dp[i - 1] + 1);
		}
		return dp[n];
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	System.out.println(solution(n));
	}
}