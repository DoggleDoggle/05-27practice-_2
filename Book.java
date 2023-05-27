package com.itwill01.method;

public class Book {

	// <<속성>>

	int b_no;// 책번호

	String b_tit;// 책제목
	String b_clas; // 책분류
	String b_ex;// 책설명

	// <<기능>>

	// - 책정보대입
	void info(int b_no, String b_tit, String b_clas, String b_ex) {

		this.b_no = b_no;
		this.b_tit = b_tit;
		this.b_clas = b_clas;
		this.b_ex = b_ex;
	}

	// - 책정보출력
	void print() {
		System.out.printf("--------------책 정보 출력----------------\n");
		System.out.printf("책번호  제목   분류  설명  \n");
		System.out.printf("%2d %4s %2s %2s \n", this.b_no, this.b_tit, this.b_clas, this.b_ex);

	}

}
