package project_1;
import java.util.Scanner;
public class First_digit {
	public static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, F_digit=0, L_digit = 0, temp;
		sc = new Scanner(System.in);
		
		System.out.print(" Enter a Number : ");
		number = sc.nextInt();	
		temp=number;
		L_digit = number%10;
		System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + L_digit);

		for(;number>= 10;)
		{
			number = number / 10;	
		
		    F_digit = number ;
		}
		System.out.println("\n The First Digit of a Given Number " + number + "  =  " + F_digit);
	}	

	}

