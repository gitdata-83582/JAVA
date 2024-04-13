package com.sunbeam;

	import com.sunbeam.Fruit;
	import com.sunbeam.Mango;
	import com.sunbeam.Apple;
	import com.sunbeam.orange;
	import java.util.*;

	enum callMenu
	{
		exit,apple,mango,orange,displayAll,displayFresh,displayStale,makeStale,sourStale
	}

	public class Tester {
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of basket");
		Fruit basket[]= new Fruit[sc.nextInt()];
		int index=0;
		Fruit F;
		callMenu choice;

		do
		{	
			
			
			
			System.out.println("enter 0 to exit");
			System.out.println("enter 1 to add mango");
			System.out.println("Enter 2 to add apple");
			System.out.println("Enter 3 to add orange");
			System.out.println("Enter 4 to display names of all fruits");
			System.out.println("Enter 5 to display names of all fresh fruits");
			System.out.println("enter 6 to get all stale fruits");
			System.out.println("enter 7 to mke a fruit as stale");
			System.out.println("enter 8 to mark all sour fruits as stale");
			
			
			System.out.println("Enter choice");
			choice= callMenu.values()[sc.nextInt()];
			
			switch(choice)
			{
			case mango:
					if(index<basket.length)
					{
						F= new Mango();
						F.setFresh(true);
						basket[index++]=F;
						 System.out.println("**************************");
					    System.out.println("Mango added successfully");
					    System.out.println("**************************");
						
						
					}
					else
					{   System.out.println("**************************");
						System.out.println("Basket is full");
						System.out.println("**************************");
					}
					break;
			case apple:
				if(index<basket.length)
				{
					F= new Apple();
					F.setFresh(true);
					basket[index++]= F;
					 System.out.println("**************************");
					    System.out.println("Apple added successfully");
					    System.out.println("**************************");
					
				}
				else
				{   System.out.println("**************************");
					System.out.println("Basket is full");
					System.out.println("**************************");
				}
				break;
			case orange:
				if(index<basket.length)
				{
					F= new orange();
					F.setFresh(true);
					basket[index++]= F;
					 System.out.println("**************************");
					    System.out.println("Orange added successfully");
					    System.out.println("**************************");
					
				}
				else
				{   System.out.println("**************************");
					System.out.println("Basket is full");
					System.out.println("**************************");
				}
				break;
				
			case exit:
				System.out.println("Thankyou");
				break;
				
			case displayAll:
				for(int i=0;i<index;i++)
				{
					System.out.println("name: "+basket[i].getName());
					
				}
				break;
				
			case displayFresh:
				for(int i=0;i<index;i++)
				{
					if(basket[i].isFresh())
					{
						System.out.println(basket[i].toString());
					}
				}
				break;
				
			case displayStale:
				for(int i=0;i<index;i++)
				{
					if(basket[i].isFresh()==false)
					{
						System.out.println(basket[i].toString());
					}
				}
				break;
				
			case makeStale:
				System.out.println("Enter index of the fruit to make it as stale");
				int c=sc.nextInt();
				for(int i=1;i<=c;i++)
				{
					if(c==i)
					{
						basket[i].setFresh(false);
						System.out.println("******************************");
						System.out.println("Fruit added to stale category");
						System.out.println("******************************");
					}
					else
					{
						System.out.println("Invalid index");
					}
				}
				break;
			case sourStale:
				
				for(Fruit el:basket)
				{   String t="sweet n sour";
				    String p="sour";
				    
					if(t==el.Taste()|| p==el.Taste())
					{
						el.setFresh(false);
					}
					
				}
				break;
			}
		}
		while(choice!=callMenu.exit);
		}
		
	}

