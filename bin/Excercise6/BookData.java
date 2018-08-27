package com.Assignment.Excercise6;

import java.util.*;

public class BookData {
	String author;
	int bookNo;
	float price;
	String publication;
	String title;
	private Book book[] = new Book[5];
	Scanner sc = new Scanner(System.in);

	public void setBooks() {
		for (int i = 0; i < 2; i++) {
			book[i] = new Book();
			System.out.println("Enter the name of the author:");
			author = sc.next();
			book[i].setAuthor(author);
			System.out.println("Enter the bookNo:");
			bookNo = sc.nextInt();
			book[i].setBookNo(bookNo);
			System.out.println("Enter the price of the book:");
			price = sc.nextFloat();
			book[i].setPrice(price);
			System.out.println("Enter the name of the publication:");
			publication = sc.next();
			book[i].setPublication(publication);
			System.out.println("Enter the title:");
			title = sc.next();
			book[i].setTitle(title);
		}
	}

	public void printBooks() {
		for (int i = 0; i < 2; i++) {
			System.out.println(book[i]);
		}

	}
	int count=0;
	public void searchBookByTitle(String title) {
		for (int i=count; i < 2; i++) {
			if (book[i].getTitle().equals(title)) {
				System.out.println("Book author: " + book[i].getAuthor()
						+ "\n bookNo: " + book[i].getBookNo()
						+ "\n book price:" + book[i].getPrice()
						+ "\n book publication: " + book[i].getPublication());
			} 
			else if(book[i].getTitle()!=title){
				count++;
			}
			else{
				System.out.println("Book not found");
			}
		}
	}

}
