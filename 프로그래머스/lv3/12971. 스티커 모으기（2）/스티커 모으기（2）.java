class Solution {
    public int solution(int rewards[]) {
        int answer = 0;
        int N = rewards.length;
        if (N == 1) return rewards[0];
        int[] dp = new int[N], dp2 = new int[N];

        dp[0] = rewards[0];
        dp2[0] = 0;

        dp[1] = rewards[0];
        dp2[1] = rewards[1];

        for (int i = 2; i < N - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + rewards[i]);
        }
        for (int i = 2; i < N; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + rewards[i]);
        }

        return Math.max(dp[N - 2],dp2[N - 1]);
    }
}