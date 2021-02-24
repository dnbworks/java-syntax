/**
 * @(#)SUBJECT_DOOYONG.java
 *
 *
 * @author 
 * @version 1.00 2018/10/15
 */

import java.util.Scanner;
public class SUBJECT_DOOYONG {

    public static void main (String [] args) {
       	String na,ad;
    	int yc,sc,ag;
       
    String s [] = {"","COMPUTER PROGRAMMING","EMPOWERMENT TECHNOLOGY","GENERAL MATHEMATICS","PHYSICAL EDUCATION","ENGLISH 101","FILIPINO 101","SOCIAL SCIENCE"};
    String t [] = {"","PARSLY TAYAG","JEROME PERANDO","PAYMART BERMUDO","ROBERTO MINGOY","PAULO MALABANAN","LUIGY ANDRES","SHARON LOPEZ"};
    String l [] = {"","EASY","AVERAGE","DIFFICULT","AVERAGE","DIFFICULT","AVERAGE","DIFFICULT"};
    int ur [] = {0,800,700,600,500,500,600,700};
    
    int y [] = {0,10,11,12};
    int us [] = {0,4,5,6,8};
    
    double tp,count,tt,dis=0;
    
    
    
    
    	Scanner in = new Scanner (System.in);
    	
    	
    	
    	
    	System.out.println("Student name:");
    	na = in.nextLine();
    	System.out.println("Student Address:");
    	ad = in.nextLine();
    	System.out.println("Student age:");
    	ag = in.nextInt();
    	System.out.println("Subject code:");
    	sc = in.nextInt();
    	System.out.println("Year code:");
    	yc = in.nextInt();
    	
    	tp = us[yc] * ur[sc];
    	
    		
    		
    	if (tp<2000)
    	{
    	dis = 0.02;	
    	}
    		if (tp >= 2000&&tp < 3000 )
    	{
    		dis = 0.04;
    	}
    		if (tp > 3000)
    	{
    	dis = 0.05;	
    	}
    	
    	count = (tp * dis);
    	tt = tp - count; 
    
    	System.out.println("************************");
    	System.out.println("Student name:" + na);
    	System.out.println("Student Address:" + ad);
    	System.out.println("Student age:" + ag);
    	System.out.println("***********************");
    	System.out.println("Subject name:" + s [sc]);
    	System.out.println("Subject teacher:" + t [sc]);
        System.out.println("Subject level :" + l [sc]);
    	System.out.println("Unit per rate:"+ ur [sc]);
    	System.out.println("Year level:" + y [sc]);
    	System.out.println("Unit per subject:" + us [sc]);
    	System.out.println("***************************");
    	System.out.println("Tuition per subject:" + tp);
    	System.out.println("Discount:" + count);
    	System.out.println("Total Tuition fee:" + tt);
    	
    }
    
    
}