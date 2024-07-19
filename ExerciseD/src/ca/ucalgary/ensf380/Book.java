package ca.ucalgary.ensf380;

public class Book {
	private String isbn;
	private int publicationYear;
	private int pages;
	
	public Book() {}
	
	public Book(String isbn, int publicationYear, int pages) {
		this.isbn = isbn;
		this.publicationYear = publicationYear;
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
		System.out.println("Isbn set to:" + this.getIsbn());
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
		System.out.println("Publication Year set to:" + this.getPublicationYear());
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
		System.out.println("Page Count set to:" + this.getPages());
	}
}
