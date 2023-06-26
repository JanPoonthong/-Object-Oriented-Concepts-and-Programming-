package ulmpractice;

import java.util.Date;

public class Document {
	private String[] authors = new String[1];
	private Date date;
	
	
	public String[] getAuthors() {
		return authors;
	}
	
	public void addAuthor(String name) {
		String[] newArr = new String[authors.length+1];
		for (int i = 0; i < authors.length; i++) {
			newArr[i] = authors[i];
		}
		newArr[newArr.length-1] = name;
	}
	
	public Date getDate() {
		return date;
	}
}
