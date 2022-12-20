package project_1;
import java.util.Scanner;
public class Bank_transaction {

	
		// TODO Auto-generated method stub
 
		public static int deposite(int a, int b)
  {
	  int result = a+b;
	  return result;
  }
  public static int withdraw(int a , int b)	
  {
	  int result=0;
	  if(a>b)
	  {
		  result=a-b;
		  System.out.println("New balance"+result);
	  }
	  else {
		  System.out.println("insufficient balance");
	  }
	  return result;
  }
  public static void main(String[] args) 
	{
	  int choice;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("which operation do you want to perform");
	  System.out.println("1)withdraw, 2)deposite");
	   choice = sc.nextInt();
	   switch(choice) {
	 case 1:
		   System.out.println("Enter balance:");
		   int num1 = sc.nextInt();
		   System.out.println("Enter the amount to be withdrawn:");
		   int num2 = sc.nextInt();
		   int res1= Bank_transaction.withdraw(num1, num2);
		   break;
	 case 2:
		 System.out.println("Enter balance:");
		   int num3 = sc.nextInt();
		   System.out.println("Enter the amount to be deposited:");
		   int num4 = sc.nextInt();
		   int res2= Bank_transaction.deposite(num3, num4);
		   System.out.println( "New balance"+"="+res2);
		   break;
	}
}
}
