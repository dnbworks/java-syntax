/**
 * @(#)PRODUCT_dnbworks.java
 *
 *
 * @author 
 * @version 1.00 2018/9/26
 */

import java.util.Scanner;
public class PRODUCT_dnbworks {

    public static void main (String [] args) {
    	
    	
    	String name,address,pname = "", des = "";
    	int age,pq,pcode,count = 0;
    	double p = 0, prod,quo,discount;
    	
    	Scanner input = new Scanner (System.in);
    	
    	System.out.print("Customer Name: ");
    	name = input.nextLine();
    		System.out.print("Customer Address:");
    		address = input.nextLine();
    			System.out.print("Customer Age:");
    			 age = input.nextInt();
    				System.out.print("Input product code:");
    			pcode	 = input.nextInt();
    		System.out.print("Input product quantity:");
    		pq  = input.nextInt();
    		
    		if ( pcode == 1)
    		{
    		pname = "SAM TV"; p = 4586; des = "Electronic";	
    		}
    		
    			if (pcode == 2)
    		{
    		pname = "RAID DIO";	p = 2154.52; des = "Electronic";
    		}
    			if (pcode == 3)
    		{
    		pname = "LG REF";	p = 7745.22; des = "Electronic";
    		
    		}
    			if (pcode == 4)
    		{
    		pname = "AOL MONITOR";	p = 1243.63; des = "Electronic";
    		}
    			if (pcode == 5)
    		{
    		pname = "FUZION TOP";	p = 8456.2; des = "Appliance";
    		}
    			if (pcode == 6)
    		{
    		pname = "ORO PAN";	p = 398.26; des = "Appliance";
    		}
    			if (pcode == 7)
    		{
    		pname = "ELECT COFFEE";	p = 567.26; des = "Appliance";
    		}
    		// discount
    		
    		if (pq < 5)
    		{
    		count = 2 ;
    		}
    			if (pq >= 5)
    		{
    		count = 5 ;
    		}
    			if (pq >= 10)
    		{
    		count = 8 ;
    		}
    		
    		
    		
    		// computation
    		prod = pq * p ;
    		discount = prod * count;
    		quo = discount / 100;
    		
    		// output
    		System.out.print("****************************************");	
    		System.out.print("Customer Name: " + name);
    		System.out.print("Customer age: " + age );
    		System.out.print("Customer address: " + address);
    		System.out.print("product code: " + pcode);
    		System.out.print("product quantity: " + pq);
    		System.out.print("product description: " + des );
    		System.out.print("product amount: " + p);
    		System.out.print("Total payment: " + prod);
    		System.out.print("Discount: " + count);
    		System.out.print("Net total: "  + quo);
    }
    
    
}