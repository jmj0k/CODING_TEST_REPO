import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
    	int end = 0; 
    	int min = Integer.MAX_VALUE;
		int sum = A[0];
    	while (start < N) {
    		while (end < N && sum < M) {
    			end++;
    			if (end != N) sum += A[end];
    		}
    		if (end == N) break;
    		min = Math.min(min, end - start + 1);
    		sum -= A[start];
    		start++;
    	}
        System.out.println(min== Integer.MAX_VALUE ? 0 : min);
        br.close();
	}
}