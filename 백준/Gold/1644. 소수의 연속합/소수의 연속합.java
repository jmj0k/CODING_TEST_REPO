import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static int[] primeNum;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        findPrimeNum(n);  // 소수 찾기

        int low = 0, high = 0;
        int sum = primeNum[0];
        int result = 0;

        // 포인터를 이동시키며 소수 배열 탐색
        while (low <= high && high < primeNum.length - 1) {
            if (sum < n) {  // sum이 n보다 작은 경우
                sum += primeNum[++high];  // high를 한칸 뒤로 이동시키고 그 값을 sum에 추가
            } else if (sum == n) {  // sum이 n과 같은 경우
                result += 1;  // 결과를 하나 증가시키고
                sum += primeNum[++high];  // high를 한칸 뒤로 이동시키고 그 값을 sum에 추가
            } else if (sum > n) {  // sum이 n보다 큰 경우
                sum -= primeNum[low++];  // low가 가리키는 값을 sum에서 빼고 low의 위치를 한칸 이동
            }
        }

        // 구해진 소수의 마지막 수가 n과 같은 경우 result + 1 해주기
        if (primeNum[primeNum.length - 1] == n) {
            result += 1;
        }

        System.out.println(result);
    }

    // 주어진 수보다 작거나 같은 소수 모두 찾기
    private static void findPrimeNum(int n) {
        boolean[] isPrimeNum = new boolean[n + 1];
        Arrays.fill(isPrimeNum, true);

        ArrayList<Integer> primeNumList = new ArrayList<>();

        for (int i = 2; i < n + 1; i++) {
            if (isPrimeNum[i]) {  // 해당 인덱스가 소수인 경우
                int j = 2;
                while (i * j < n + 1) {  // 해당 인덱스의 배수를 모두 소수가 아니도록 처리
                    isPrimeNum[i * j] = false;
                    j += 1;
                }
                primeNumList.add(i);  // 해당 인덱스는 소수이므로 추가
            }
        }

        primeNum = primeNumList.stream().mapToInt(i -> i).toArray();
        // 소수가 없는 경우 임의로 0을 저장하여 반환
        if (primeNum.length == 0) {
            primeNum = new int[1];
        }
    }
}