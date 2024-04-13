package com.sunbeam;

	import com.sunbeam.Assign3_Ques1;
	import java.util.*;


	public class Assign3_Ques1_2 {

		public static void main(String[] args) {
			
			System.out.println("Enter number of points to plot: ");
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			
			
			Assign3_Ques1 p1[]=new Assign3_Ques1[n];
			
			for(int i=0;i<p1.length;i++)
			{
				p1[i]=new Assign3_Ques1();
				p1[i].accept();
			}
			
			int choice;
			
			do
			{
				System.out.println("Enter 0 to exit: ");
				System.out.println("Enter 1 to Display details of a specific point");
				System.out.println("Enter 2 to Display x, y co-ordinates of all points");
				System.out.println("Enter 3 to ");
				
				choice=sc.nextInt()	;
				
				switch(choice)
				{
				case 0:
					System.out.println("Thankyou");
					break;
					
				case 1:
					System.out.println("Enter the index to see a specific point:");
					int index=sc.nextInt();
					for(int i=0;i<p1.length;i++)
					{   if(p1[index]==p1[i])
					{
						p1[i].display();
					}
					else
					{   System.out.println("******************");
						System.out.println("invalid index");
						System.out.println("******************");
					}
					}
					break;
					
				case 2:
					System.out.println("The points of all the objects are: ");
					for(Assign3_Ques1 element:p1)
					{
						element.display();
					}
					break;
					
				case 3:
					
					System.out.println("Enter index1 ");
					int x=sc.nextInt();
					if(x<0||x>p1.length)
					{   System.out.println("******************");
						System.out.println("index is invalid");
						System.out.println("******************");
					}
					System.out.println("Enter index2: ");
					int y=sc.nextInt();
					if(y<0||y>p1.length)
					{
						System.out.println("index is invalid");
					}
					if(!p1[x].isEqual(p1[y]))
					{
					p1[x].getDistance(p1[y]);
					}
					break;
					
					
					
				}
				
				
				
			}
			while(choice!=0);
			
			

		}

	}

