package com.sunbeam;


	public class Fruit {
		private String color;
		private  double weight;
		private String name;
		private boolean isFresh;
		
		public Fruit()
		{
			
		}
		
		public Fruit(String color, double weight, String name) {
			
			this.color = color;
			this.weight = weight;
			this.name = name;
		
		}
		
		public String Taste()
		{
			return "no specific taste";
		}
		
		public String toString()
		{   if(isFresh)
		{
			return "color of the fruit: "+color+"// weight: "+weight+"// name: "+ name+"// fresh status: fresh";
		}
		else
		{
			return "color of the fruit: "+color+" weight: "+weight+" name: "+"fresh status: fresh";
		}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isFresh() {
			return isFresh;
		}

		public void setFresh(boolean isFresh) {
			this.isFresh = isFresh;
		}
		
		
		
	}

