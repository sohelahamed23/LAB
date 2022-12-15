package project_1;
import java.util.Scanner;
public class Vowel {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in); 
	       char c ;
	       System.out.println("Enter a character");
	       c = sc.next().charAt(0);
	       if((c=='a' || c=='e'||  c=='i'|| c=='o'|| c=='u')||(c=='A' || c=='E' || c=='I'|| c=='O'|| c=='U'))
	       {
	    	   System.out.println("the character is a VOWEL");
	    	  
	       }
	       else
	       {
	    	   System.out.println("the character is  a CONSONENT");
	       }
	       
		}

	}



