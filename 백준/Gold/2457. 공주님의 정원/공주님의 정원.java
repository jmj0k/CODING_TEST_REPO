import java.util.*;

class Main {
	public static int solution(int[][] arr) {
		int ans = 0;
		Arrays.sort(arr, ((a, b) -> a[0] - b[0]));
		int time = 301;
		if (arr[0][0] > time) return 0;
		for (int i = 0; i < arr.length; i++) {
			int tmp = 0;
			ans++;
			int st = i != 0 ? i - 1 : 0;
			while (st != arr.length && arr[st][0] <= time) {
				tmp = Math.max(tmp, arr[st][1]);
				st++;
			}
			time = tmp;
			if (time > 1130) return ans;
		}
		return 0;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[][] arr = new int[n][2];
    	for (int i = 0; i < n; i++) {
    		arr[i][0] = sc.nextInt() * 100 + sc.nextInt();
    		arr[i][1] = sc.nextInt() * 100 + sc.nextInt();
    	}
    	System.out.println(solution(arr));
	}
}