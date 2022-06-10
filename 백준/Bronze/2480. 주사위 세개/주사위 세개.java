import java.util.*;
public class Main {
	static final int DIVIDE_MIN = 60;
	static final int DIVIDE_HOUR = 24;
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = { scanner.nextInt(), scanner.nextInt(), scanner.nextInt() };
        int reward = 0;
		Arrays.sort(nums);
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
        	reward = 10000 + (nums[1] * 1000);
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
        	reward = 1000 + (nums[1] * 100);
        } else {
        	reward = nums[2] * 100;
        }
        System.out.println(reward);
    }
}
