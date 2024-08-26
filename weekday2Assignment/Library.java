package weekday2Assignment;

public class Library {

	
	public  String addBook() {
		String bookTitle = "Book added successfully";
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public  void issueBook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		
		lib.addBook();
		lib.issueBook();
		
	}

}
