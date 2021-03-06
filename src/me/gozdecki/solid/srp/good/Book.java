package me.gozdecki.solid.srp.good;

/*
 * The printing task is taken by some specific class.
 * 
 * */
public class Book implements Printable{
	
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
	

	public String getContent() { //now it's not printing, but just a getter.
		return text;
	}
	
}
