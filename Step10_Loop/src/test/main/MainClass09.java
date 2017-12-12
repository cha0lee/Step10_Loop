package test.main;

import test.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		
		System.out.println("메인 메소드가 시작되었습니다.");
		
		/*
		 * MemberDto 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서 3명의 회원정보를 각각 저장해보새요.
		 */
		
		//회원정보를 누적할 배열 객체 생성
		MemberDto[] members = new MemberDto[3];
		
		MemberDto dto1 = new MemberDto();
		
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		
		members[0] = dto1;
		members[1] = dto2;		
		members[2] = new MemberDto(3, "주뎅이", "상도동");
		
		for(MemberDto tmp:members) {

			showInfo(tmp);
		}
		
//		showInfo(members[0]);
//		showInfo(members[1]);
//		showInfo(members[2]);
		
		
//		for(int i = 0; i < members.length; i++) {
//			
//			MemberDto tmp = new MemberDto();
//			
//			members[i] = tmp;
//			
//			tmp.setNum(i+1);
//			tmp.setName("회원" + i);
//			tmp.setAddr("행신동" + i);
//			
//			showInfo(tmp);
//		}
	}
	
	public static void showInfo(MemberDto dto) {
		System.out.println("-----------");
		System.out.println("번호: " + dto.getNum());
		System.out.println("이름: " + dto.getName());
		System.out.println("주소: " + dto.getAddr());
		
	}
	
	
	
	

}
