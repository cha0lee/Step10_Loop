package test.dto;
/*
 * Data Transfer object의 약자: Dto 
 */
public class MemberDto {
	//멤버 필드 정의하기
	private int num;
	private String name;
	private String addr;
	
	//디폴트 생성자
	public MemberDto(){}

	//alt + shift + s > generate constructor using field
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}

	//alt + shift + s > generate getter and setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

}
