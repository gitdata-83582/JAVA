package com.sunbeam;

enum category
{
	travelling,spiritual,technical
}
public class Book implements Comparable<Book>
{
 
	private String isbn;
	private category c;
	private double price;
	private String author;
	private int quantity;
	
	public Book()
	{
		
	}

	public Book(String isbn, category c, double price, String author, int quantity) 
	{	
		this.isbn = isbn;
		this.c = c;
		this.price = price;
		this.author = author;
		this.quantity = quantity;
	}

	@Override
	public String toString()
	{
		return "book [isbn=" + isbn + ", c=" + c + ", price=" + price + ", author=" + author + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null)
		{
			if (other.isbn != null)
				return false;
		}
		else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public category getC() {
		return c;
	}

	public void setC(category c) {
		this.c = c;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Book o) 
	{
		
		return this.isbn.compareTo(o.isbn);
	}
	
	
	

}