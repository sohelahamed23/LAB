package project_1;
import java.util.Scanner;
public class inverted_half_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		 System.out.print("Enter Symbol : ");
			
         char c = sc.next().charAt(0);
	    for (int i = num; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	}

}
}
