class Solution {
    public int solution(int[] rewards) {
        int N = rewards.length;
        int[] dp = new int[N-1];
        dp[0] = rewards[0];
        dp[1] = Math.max(rewards[0], rewards[1]);

        for (int i = 2; i < N-1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + rewards[i]);
        }
        int res = dp[dp.length - 1];

        dp = new int[N];
        dp[0] = 0;
        dp[1] = rewards[1];
        for (int i = 2; i < N; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + rewards[i]);
        }

        return Math.max(res, dp[dp.length - 1]);
    }
}