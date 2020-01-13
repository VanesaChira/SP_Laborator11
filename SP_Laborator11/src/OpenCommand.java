
public class OpenCommand implements Command {

	private String path;
	
	public OpenCommand(String p) {
		// TODO Auto-generated constructor stub
		this.path = p;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JSONBuilder jsonBuilder = new JSONBuilder("D:\\Facultate\\AN 3\\SP\\SP_Laborator11\\book.json");
	    jsonBuilder.build();
	    Book book = new Book("book.json");
	    book.add(jsonBuilder.getResult());
	    
	    DocumentManager.getInstance().setBook(book);
	    book.print();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
