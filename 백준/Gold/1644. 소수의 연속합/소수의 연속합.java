import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	boolean[] prime = new boolean[N + 1];
    	ArrayList<Integer> primeNumList = new ArrayList<>();
    	Arrays.fill(prime, true);
    	for (int i = 2; i <= N; i++) {
    		if (!prime[i]) continue;
    		for (int j = 2; j * i <= N; j ++) {
    			prime[j * i] = false;
    		}
    		primeNumList.add(i);
    	}
    	int[] primeNum = primeNumList.stream().mapToInt(i -> i).toArray();
    	if (primeNum.length == 0) primeNum = new int[1];
    	
    	int en = 0;
    	int count = 0;
    	for (int st = 0; st < primeNum.length;) {
    		int sum = 0;
    		while (en < primeNum.length && sum < N) {
    			sum += primeNum[en];
    			en++;
    		}
    		if (sum == N) count++;
    		if (en == N) break;
    		st++;
    		en = st;
    	}
    	System.out.println(count);
	}
}
