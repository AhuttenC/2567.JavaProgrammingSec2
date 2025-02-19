import java.util.*;
public class FictionDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Book Title: ");
		String bookTitle = scan.nextLine();
		System.out.print("Book publish year: ");
		int publiscYear = scan.nextInt();
		scan.nextLine();
		System.out.print("Author name: ");
		String authorName = scan.nextLine();
		System.out.print("Author email: ");
		String authorEmail = scan.nextLine();
		FictionBook book1 = new FictionBook(bookTitle, publiscYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
			System.out.print("Author email, again: ");
			authorEmail = scan.nextLine();
			book1.setEmail(authorEmail);
		}
		Line();
		System.out.println(book1);
	}
	public static void Line() {
		for (int i = 1; i < 60; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
