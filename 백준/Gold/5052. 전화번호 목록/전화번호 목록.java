import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static String NumberListAvailabilityCheck (String[] numberList) {
		Arrays.sort(numberList);
        for (int i = 0; i < numberList.length - 1; i++) {
            if (numberList[i + 1].startsWith(numberList[i])) return "NO";
        }
		return "YES";
	}
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] strs = new String[n];
			for (int j = 0; j < n; j++) {
				strs[j] = br.readLine();
			}
			System.out.println(NumberListAvailabilityCheck(strs));
		}
    }
}