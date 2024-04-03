package com.sunbeaminfo.kdac;


import com.sunbeaminfo.kdac.Invoice;

public class Tester {

	public static void main(String[] args) {
		Invoice i= new Invoice("111","MONITOR",5,15000);
		System.out.println("PART NUMBEAR = "+i.getPnum());
		System.out.println("PART DESCRIPTION = "+i.getPdesc());
		System.out.println("PART QUNTITY = "+i.getQty());
		System.out.println("PART PRICE = "+i.getPrice());
		System.out.println("CALCULATE INVOICE = "+i.calculateInvoice());
		
		

	}
}
