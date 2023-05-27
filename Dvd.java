package com.itwill01.method;

public class Dvd {

	// <<속성>>

	int dvd_no; // Dvd 번호
	String dvd_tit; // Dvd타이틀
	String dvd_gen; // Dvd쟝르

	// <<기능>>

	// - Dvd정보대입
	void inf(int dvd_no, String dvd_tit, String dvd_gen) {
		this.dvd_no = dvd_no;
		this.dvd_tit = dvd_tit;
		this.dvd_gen = dvd_gen;

	}

	// - Dvd정보출력
	void prin() {
		System.out.printf("---------Dvd 정보-----------\n");
		System.out.printf("Dvd번호  타이틀   장르   \n");
		System.out.printf("%2d %6s %3s  \n", this.dvd_no, this.dvd_tit, this.dvd_gen);
	}

}
