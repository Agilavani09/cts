package data_structure;

public class AppLibrarySearch {
	public static void main(String[] args) {
        BookDetails[] books = {
            new BookDetails(1, "The Alchemist", "Paulo Coelho"),
            new BookDetails(2, "Atomic Habits", "James Clear"),
            new BookDetails(3, "Clean Code", "Robert C. Martin"),
            new BookDetails(4, "To Kill a Mockingbird", "Harper Lee")
        };

        System.out.println(" Linear Search for 'Clean Code':");
        int index1 = BookSearchLogic.linearSearch(books, "Clean Code");
        if (index1 != -1) books[index1].display();
        else System.out.println("Book not found.");

        System.out.println("\n Sorting books for Binary Search...");
        BookSearchLogic.sortBooksByTitle(books);

        System.out.println("\n Binary Search for 'Atomic Habits':");
        int index2 = BookSearchLogic.binarySearch(books, "Atomic Habits");
        if (index2 != -1) books[index2].display();
        else System.out.println("Book not found.");
    }
}
