package com.sunbeam2;

	import java.util.*;
	public class TotalCost {

		private double miles;
		private double fuelPrice;
		private double avgMiles;
		private double pFees;
		private double tolls;
		public TotalCost()
		{
			
		}
		public TotalCost(double miles, double fuelPrice, double avgMiles, double pFees, double tolls) {
			
			this.miles = miles;
			this.fuelPrice = fuelPrice;
			this.avgMiles = avgMiles;
			this.pFees = pFees;
			this.tolls = tolls;
		}
		
		public void accept()
		{
			System.out.println("Enter Total miles driven per day:");
			Scanner sc= new Scanner(System.in);
			miles=sc.nextDouble();
			System.out.println("enter Cost per gallon of gasoline:");
			fuelPrice=sc.nextDouble();
			System.out.println("enter Average miles per gallon:");
			avgMiles=sc.nextDouble();
			System.out.println("enter Parking fees per day.");
			pFees=sc.nextDouble();
			System.out.println("enter Tolls per day.");
			tolls=sc.nextDouble();
		}
		public double getTotal()
		{
			double total=(miles/avgMiles)*fuelPrice+pFees+tolls;
			return total;
		}
		
		
		
	}


