package kr.brains.project;

import java.time.LocalDateTime;

//웹툰 등록, 조회
//웹툰은 Book 종류이다.
//웹툰의 주요 속성은? 제목, 장르, 저자, 판매량
public class webtoon implements Book {
	private String isbn;
	private String title;
	private String genre;
	private String author;
	private LocalDateTime date;
	private int count;
	
	public webtoon() {   };
	public webtoon(String isbn, String title, String genre, String author){   
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.date = LocalDateTime.now();
	}
	
}
