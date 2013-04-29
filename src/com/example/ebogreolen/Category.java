import java.util.ArrayList;

public class Category {

	private String name;
	private ArrayList bookList = new ArrayList();
	private ArrayList categoryList = new ArrayList();
	private boolean isSuperCategory;

	public Category(String name, ArrayList<Book> bookList,
			ArrayList<Category> categoryList, boolean isSuperCategory) {
		this.name = name;
		this.bookList = bookList;
		this.categoryList = categoryList;
		this.isSuperCategory = isSuperCategory;
	}

	public boolean isSuperCategory() {
		return this.isSuperCategory;
	}

	public ArrayList<Book> getBookList() {
		if (!this.isSuperCategory) {
			return this.bookList;
		}
		return null;

	}

	public ArrayList<Category> getSubCategories() {
		if (this.isSuperCategory) {
		return this.categoryList;
		}
		return null;
	}

	public String getName() {
		return this.name;
	}

}
