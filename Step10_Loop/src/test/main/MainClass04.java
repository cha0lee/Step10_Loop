package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		//Random한 수를 얻어낼 수 있는 Random 객체 생성
		Random ran =new Random();
		
		
		int[] nums = new int[5];
		
		//배열의 방의 갯수만큼 반복문 수행
		for(int i = 0; i < nums.length; i++) {
			//0에서 9 사이의 랜덤한 숫자 얻기
			int ranNum = ran.nextInt(10);
			
			//얻어온 랜덤 값을 nums에 넣기
			nums[i] = ranNum;
			
			System.out.println("nums[" + i + "]: " + nums[i]);
		
		}
		
		System.out.println("메인 메소드가 종료됩니다.");
		
	}
}
