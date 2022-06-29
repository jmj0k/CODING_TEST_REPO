import java.util.*;

class Main {
	public static int solution(int[][] arr) {
		Arrays.sort(arr, ((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]));
		int time = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (time > arr[i][0]) continue;
			time = arr[i][1];
			cnt++;
		}
		return cnt;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[][] arr = new int[n][2];
    	for (int i = 0; i < n; i++) {
    		arr[i][0] = sc.nextInt();
    		arr[i][1] = sc.nextInt();
    	}
    	
    	System.out.println(solution(arr));
	}
}