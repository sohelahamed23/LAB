package project_1;

import java.util.Scanner;

public class Sohel_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in); 
       char c ;
       System.out.println("Enter a character");
       c = sc.next().charAt(0);
       if((c>='a'&& c<='z')||(c>='A'&& c<='Z'))
       {
    	   System.out.println("the character is an alphabet");
    	  
       }
       else
       {
    	   System.out.println("the character is not an alphabet");
       }
       
	}

}
