package data_structure;
import java.util.Arrays;
import java.util.Comparator;
public class BookSearchLogic {
	 public static int linearSearch(BookDetails[] books, String searchTitle) {
	        for (int i = 0; i < books.length; i++) {
	            if (books[i].title.equalsIgnoreCase(searchTitle)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	  
	    public static int binarySearch(BookDetails[] books, String searchTitle) {
	        int low = 0, high = books.length - 1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            int cmp = searchTitle.compareToIgnoreCase(books[mid].title);
	            if (cmp == 0) return mid;
	            else if (cmp < 0) high = mid - 1;
	            else low = mid + 1;
	        }
	        return -1;
	    }

	   
	    public static void sortBooksByTitle(BookDetails[] books) {
	        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
	    }
}
