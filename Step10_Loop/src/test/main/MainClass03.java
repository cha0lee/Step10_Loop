﻿package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 방 10개짜리 int[] 객체를 만들고 각각의 방에 순서대로 1, 2, 3, 4, 5, 6, 7, 8, 9, 20을 넣어보세요. 
		 */
		
		int[] nums = new int[10]; 
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
			System.out.println("nums[" + i + "]: " + nums[i]);
		}
	}
}
