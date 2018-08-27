package com.Assignment.Excercise6;
import java.util.Scanner;
public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookData bd=new BookData();
		Scanner sc=new Scanner(System.in);
		bd.setBooks();
		bd.printBooks();
		System.out.println("Enter the title of the book which u want to search");
		String title=sc.nextLine();
		bd.searchBookByTitle(title);
		sc.close();
	}

}
