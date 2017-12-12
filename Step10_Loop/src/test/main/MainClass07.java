package test.main;

import test.mypac.Pen;

public class MainClass07 {
	public static void main(String[] args) {
		//Pen type객체를 담을 수 있는 방 3개짜리 배열객체 생성
		Pen[] pens = new Pen[3];
		
		pens[0] = new Pen("red");
		pens[1] = new Pen("green");
		pens[2] = new Pen("blue");
		
		//반복문을 이용해서 배열에 저장된 모든 Pen 객체의 write 메소드와 draw 메소드 호출하기
		for(int i = 0; i < pens.length; i++) {
			pens[i].write().draw();
		}
		
		System.out.println();
		System.out.println("=====확장 for문=====");
		System.out.println();
		
		for(Pen tmp:pens) {
			tmp.write().draw();
		}
	}

}
