/**
 * @(#)TOURIST_DOOYONG.java
 *
 *
 * @author 
 * @version 1.00 2018/10/10
 */

import java.util.Scanner;
public class TOURIST_DOOYONG {

    public static void main(String [] args) {
    	
    	String na;
    	int lc,tc,fc,hp,hd,gt = 0;
    	double tp,tpp,tppr,dis,nt;
    	
    	    String p [] = {"","TANAY RIZAL","CEBU CITY","CALAMBA LAGUNA","BATANGAS CITY","BAGUIO CITY"};
    	    String pt [] = {"","MOUNTAIN","LOCAL PRODUCT","LOCAL PRODUCT","BEACHES","MOUNTAIN"};
    	 	int ep [] = {0,500,600,450,550,700};
    	 	String fo [] = {"","FOOD ONLY","ACCOMODATION ONLY","FOOD & ACCOMODATION","NONE"};
    	 	int fm [] = {0,250,500,700,0};
    	 	String g []= {"","LEO PONTIS","MARIA MAKI","JOSE JESUS","HANEY JANE","JERSON RICE"};
    	 	int r [] = {0,350,340,330,350,370};
    	 	
    	 	
    	 	
    	 	
    	 	Scanner in = new Scanner (System.in);
    	 	
    	 	System.out.println("INPUT TOURIST NAME:");
    	 	na = in.nextLine();
    	 	System.out.println("INPUT LOCATION CODE:");
    	 		lc = in.nextInt();
    	 	System.out.println("INPUT TOUR CODE:");
    	 		tc = in.nextInt();
    	 	System.out.println("INPUT FOOD CODE:");
    	 		fc = in.nextInt();
    	 	System.out.println("HOW MANY PERSON:");
    	 		hp = in.nextInt();
    		System.out.println("HOW MANY DAYS:");
    			hd = in.nextInt();
    			
    			if (tc < 5)
    			{
    				gt = 2;
    			}
    				
    			if (tc >= 5 && tc < 10)
    			{
    				gt = 5;
    			}
    				
    			if (tc >= 10 && tc < 20)
    			{
    				gt = 10;
    			}
    			
    			tp =ep [lc] + r[tc] + fm[fc];
    			tpp = tp * hd;
    			tppr = 	tpp * hp;
    			dis = tppr * gt/100;
    			nt = tppr - dis;
    			
    		System.out.println("*******************************");
         	System.out.println("TOURIST NAME:" + na);
   	        System.out.println("LOCATION OF TOUR:" + p [lc]);
    	 	System.out.println("LOCATION TYPE:" + pt [lc]);
    	 	System.out.println("ENTRY PRICE:" + ep [lc]);
    	 	System.out.println("TOUR GUIDE:" + g [lc]);
    	 	System.out.println("TOUR GUIDE RATE:" +r [lc]);
    		System.out.println("WITH FOOD AND ACCOMODATION:" + fo [lc]);
    		System.out.println("AMOUNT :" + ep [lc]);
    		System.out.println("****************************");
    		System.out.println("YOUR TOUR PRICE IS:" + tp);
    		System.out.println("YOUR TOUR PRICE PER DAY:" + tpp);
    		System.out.println("DISCOUNT:" + dis );
    		System.out.println("NET PRICE:" + nt);
    			System.out.println(" ****************** ENJOY YOUR TOUR *************");
    		
    			
    												
    }
    
    
}