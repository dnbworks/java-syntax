/**
 * @(#)AVERAGE_NSAAKO.java
 *
 *
 * @author 
 * @version 1.00 2018/9/5
 */

import java.util.Scanner;
public class AVERAGE_NSAAKO {

  
    	public static void main(String []args) {
      	
    	String na , sec , str;
    	int a,b,c,d,e,f,g,h,i,ave,sum;
    	
    	 Scanner in = new Scanner(System.in);
    	 
    	 System.out.println("NAME:");
    	 	na=in.nextLine();
    	 System.out.println("SECTION:");
    	 	sec=in.nextLine();	
    	 System.out.println("STRAND:");
    	 	str=in.nextLine();
    	 System.out.println("COPRO:");
    	 	a=in.nextInt();	
    	 System.out.println("MATH:");
    	 	b=in.nextInt();
    	 System.out.println("SCIENCE:");
    	 	c=in.nextInt();	
    	 System.out.println("PE-H:");
    	 	d=in.nextInt();
    	 System.out.println("FPL:");
    	 	e=in.nextInt();
    	 System.out.println("FILIPINO:");
    	 	f=in.nextInt();
    	 System.out.println("LIT:");
    	 	g=in.nextInt();	
    	 System.out.println("ENGLISH:");
    	 	h=in.nextInt();
    	 System.out.println("EMTECH:");
    	 	i=in.nextInt();	
    	 		
    	 		
    	 		
    	 		
    	 		
    	sum=a+b+c+d+e+f+g+h+i;
    	ave=sum/9;
    	System.out.println("STUDENT NAME:"+na);
    	System.out.println("SECTION:"+sec);
    	System.out.println("STRAND:"+str);
    	System.out.println("AVERAGE:"+ave);
    }
    
    
}
    