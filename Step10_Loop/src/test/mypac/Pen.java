package test.mypac;

public class Pen {
	
	//멤버 필드
	public String color;
	
	//생성자
	public Pen(String color) {
		this.color = color;
	}
	
	//멤버 메소드
	public Pen write() {
		System.out.println(color + "색 Pen으로 필기를 해요."); //원래는 this.color이나 같은 클래스 내의 메소드 이므로 this 생략가능
		return this;
	}
	
	public Pen draw() {
		System.out.println(color + "색 Pen으로 그림을 그려요.");
		return this;
	}
	
}
