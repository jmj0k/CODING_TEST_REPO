import java.util.*;
public class Main {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
	        int kilogram = sc.nextInt();
	        int count = 0;
	        while(true) {
	         if (kilogram % 5 == 0) {
	        
	         int ki = (kilogram/5) + count; 
             System.out.println(ki);
             break;
            
            }
            else if (kilogram <= 0) {
                System.out.println("-1");
             break;
            }
            kilogram -= 3;
            count++;
	        }
		 
    }
}