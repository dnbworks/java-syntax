/**
 * @(#)IF_DOOYONG.java
 *
 *
 * @author 
 * @version 1.00 2018/9/17
 */

import java.util.Scanner;
public class IF_DOOYONG {

    public static void main (String [] args ) {
    	
    	String sname, cdesc="",ses="";
    	int scode,ccode,pdisc=0;
    	double cfee= 0;
    	
    	System.out.println("\n");
    	
    	Scanner in = new Scanner (System.in);
    	 
    	 System.out.print("Student name: ");
         sname = in.nextLine();                                                       	
          System.out.print("Session code: (1/2)");
         scode = in.nextInt();
        
     if (scode == 1) {
        ses = "MORNING";
      }
     if ( scode == 1) {
         ses = "AFTERNOON";
      }  
         System.out.print("Session code: ( 50-51-52)");
            ccode = in.nextInt();
            if (ccode == 50 ) {
          cdesc = " C++"; cfee = 7000.0;
          }
             if ( ccode == 51) {
           cdesc = " JAVA"; cfee = 8000.0;
        }
             if ( ccode == 52) {
             cdesc = " VISUAL BASIC "; cfee = 9000.00;
      }

             // output
             System.out.println("Student Name: " + sname );
                    System.out.println(" Session: " + ses);
                      System.out.println(" Course desc; " + cdesc );
                                System.out.println("Course Fee: " + cfee);


}

}