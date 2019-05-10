package me.gozdecki.solid.srp.bad;


public class Book {
	
	private String author;
	private String text;
	private String name;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void print(){     // This method isn't specific to Book, so, isn't it's responsibility. 
		System.out.println(text);
	}

}
