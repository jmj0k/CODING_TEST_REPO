import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {		
			String[] str = br.readLine().split(" ");
			int sum = Integer.parseInt(str[0])+ Integer.parseInt(str[1]);		
			sb.append(sum + "\n");
		}	
		br.close();
		System.out.print(sb);
    }
}
