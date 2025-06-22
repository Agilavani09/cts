package data_structure;

public class BookDetails {
	 int bookId;
	    String title;
	    String author;

	    public BookDetails(int bookId, String title, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	    }

	    public void display() {
	        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author);
	    }
}
