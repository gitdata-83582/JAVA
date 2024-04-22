package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Tester
{

	public static void main(String[] args) 
	{	
		Set<Book> s1=new HashSet<>();
		ArrayList<Book> a1=new ArrayList<Book>();
		ArrayList<Book> a2=new ArrayList<Book>();
		int choice;
		Scanner sc=new Scanner(System.in);
		
		do 
		{
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it.");
			System.out.println("4. Sort the book details as per author and display it.");
			System.out.println("5. Find book by id.");
			System.out.println("enter choice");
			choice=sc.nextInt();
			
			switch (choice)
			{
			case 0:
				System.out.println("Thanks for using");
				break;

			case 1:
			{
				 String isbn;
				 category c;
				 double price;
				 String author;
				 int quantity;
			     int cat;
			     
			  System.out.println("enter book details");	
			   System.out.println("enter isbn");
			   isbn=sc.next();
			   
			   System.out.println("enter price");
			   price=sc.nextDouble();
			   System.out.println("enter author");
			 
			   author=sc.next();
			   sc.nextLine();
			   System.out.println("enter quantity");
			   quantity=sc.nextInt();
			   
			   System.out.println("enter category of book");
			   category s[]=category.values();
			   for(category ele:s)
			   {
				   System.out.println(ele.ordinal()+"  "+ele.name());
			   }
			   cat=sc.nextInt();
					s1.add(new Book(isbn,s[cat],price,author,quantity));
			}	
				break;
				
			case 2:
			{
				System.out.println("books are : ");
				Iterator<Book> itr=s1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				System.out.println();
				
			}
				break;
				
				
			case 3:
			{
				a1.addAll(s1);
				System.out.println("before sorting as per category");
				Iterator<Book> itr=a1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				System.out.println();
				class categorycomparator implements Comparator<Book>
				{

					@Override
					public int compare(Book o1, Book o2) 
					{
						return o1.getC().name().compareTo(o2.getC().name());
					}
					
				}
				Comparator<Book> c=new categorycomparator();
				
				Collections.sort(a1, c);
				
				System.out.println("after sorting as per category");
				Iterator<Book> itr1=a1.iterator();
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
				System.out.println();
				
			}
				break;
				
				
			case 4:
			{
				a2.addAll(s1);
				System.out.println("before sorting as per author");
				Iterator<Book> itr=a2.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				System.out.println();
				class authorcomparator implements Comparator<Book>
				{

					@Override
					public int compare(Book o1, Book o2) 
					{
						return o1.getAuthor().compareTo(o2.getAuthor());
					}
					
				}
				Comparator<Book> c=new authorcomparator();
				
				Collections.sort(a2, c);
				
				System.out.println("after sorting as per author");
				Iterator<Book> itr1=a2.iterator();
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
				System.out.println();
				
			}
				break;
			
				
			case 5:
			{
				String isbn;
				System.out.println("enter book isbn");
				isbn=sc.next();
				Book b1=new Book();
				b1.setIsbn(isbn);
				if(s1.contains(b1))
				{
					System.out.println("book found");
					for(Book b:s1)
					{
						if(b.equals(b1))
						{
							System.out.println(b);
						}
					}
				}
				else
				{
					System.out.println("book not found");
				}
				
				
			}
				break;
				
			default:
				System.out.println("eneter a valid choice");
				break;
			}
			
		} while (choice!=0);

	}

}