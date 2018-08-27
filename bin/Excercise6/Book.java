package com.Assignment.Excercise6;

public class Book {
	private int bookNo;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString(){
		return getBookNo() + " "+getTitle()+ " "+getPublication()+" "+getAuthor()+" "+getPrice();
	}
	private String title;
	private String publication;
	private String author;
	private float price;
	

}
