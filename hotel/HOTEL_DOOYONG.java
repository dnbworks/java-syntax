/**
 * @(#)HOTEL_DOOYONG.java
 *
 *
 * @author 
 * @version 1.00 2018/9/24
 */

import java.util.Scanner;
public class HOTEL_DOOYONG {

    public static void main(String [] args) {
    		String  name,hname="",gname="";
    		int gcode,code,day,c,d;
    	
    	double a=0, prod;
    	
    	System.out.print("\n");
    	
    	Scanner in = new Scanner (System.in);
    		System.out.print("tourist name: ");
    		name=in.nextLine();
    			System.out.print("hotel code: ");
    			code = in.nextInt();
    				System.out.print("Guide code: ");
    			gcode = in.nextInt();
    				System.out.print("tour days:(3-4-5-6-7-8)");
    				day = in.nextInt();
    				
    				if (code == 1) 
    				{
    					hname = "INSUGAR HOTEL";
    				}
    				if (code == 2) 
    				{
    					hname = "BUTONG HOTEL";
    				}
    				if (code == 3) 
    				{
    					hname ="APO NEW HOTEL";
    				}
    				if (gcode == 1) 
    				{
    					gname = "JAMES BOND";a = 1106.00;
    				}
    				
    				if (gcode == 2) 
    				{
    					gname ="SYLVIE RAMBO";a = 930.00;
    				}
    					if (gcode == 3) 
    				{
    					gname = "DIEGA SILANG";a = 952.50;
    				}
    					if (gcode == 4) 
    				{
    					gname = "SABEL LOPEZ";a = 1107.25;
    				}
    				prod = a * day;
    			System.out.print("TOURIST NAME: " + name);
    			System.out.print("HOTEL: " + hname );
    			System.out.print("guide NAME: " + gname);
    			System.out.print("TOUR DAYS:"+ day);
    			System.out.print("RATE PER DAY:");
    			System.out.print("TOTAL FEE:" + prod);
    }
    
    
}