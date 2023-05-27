package com.itwill01.method;

public class BookLibraryMain {

	public static void main(String[] args) {
/*
		
		/*
		 * 책객체생성
		 */
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		
		/*
		 * 책정보대입메쏘드호출
		 */
		b1.b_no=1234;
		b1.b_tit="해리포터";
		b1.b_clas="판타지";
		b1.b_ex="마법사 해리포터의 이야기";
		
		
		b2.b_no=1234;
		b2.b_tit="체인소맨";
		b2.b_clas="만화";
		b2.b_ex="배신을 당해 죽은 주인공이 "
				+ "악마의 심장을 가진 '체인소 맨'"
				+ "으로 되살아나 공안 본부의 일원으로"
				+ " 활약하는 이야기";
		
		
		/*
		 * 책정보출력메쏘드호출
		 */
		b1.print();
		b2.print();
		
		
		
		

	}

}
