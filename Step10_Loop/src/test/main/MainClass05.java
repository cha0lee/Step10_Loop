package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		
		for(int i = 0; i < nums.length; i++) {
			int tmp = nums[i];
			System.out.println(tmp);
		}
		
		System.out.println("=====");
		
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}
}
