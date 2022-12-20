package project_1;
import java.util.Scanner;
public class Calculator {
   public static int addition(int a , int b)
   {
	   int result = a+b;
	   return result;
   }
   public static int Subtraction(int a, int b) 
   {   
	   int c;
	   if(a>b)
	   {
		    c = a-b;
	   }
	   else {
		      c = b-a;
	        } 
	   return c;
   }
   public static int Multiplication(int a, int b) 
   {
	   int result= a*b;
	   return result;
   }
   public static float Division(float a, float b) 
   {   
	 
	   float d;
	   if(a>b)
	   {
		    d = a/b;
	   }
	   else {
		      d = b/a;
	        } 
	   return d;
   }




   
   public static void main(String[] args) {
	
	int choice;   // TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("which operation do you want to perform");
   System.out.println("1)Addition, 2)Subtraction, 3)Multiplication, 4)Division");
   choice = sc.nextInt();
   switch(choice) {
   case 1:
	   System.out.println("Enter first digit:");
	   int num1 = sc.nextInt();
	   System.out.println("Enter the second digit:");
	   int num2 = sc.nextInt();
	   int res1= Calculator.addition(num1, num2);
	   System.out.println(num1+"+"+num2+"="+res1);
	   break;
   case 2:
	   System.out.println("Enter the first digit:");
	   int num3 = sc.nextInt();
	   System.out.println("Enter the second digit:");
	   int num4 = sc.nextInt();
	   int res2 = Calculator.Subtraction(num3,num4);
	   if(num3>num4) {
	   System.out.println(num3 + "-"+num4 + "="+res2);
	   }
	   else {
		   System.out.println(num4 + "-"+num3 + "="+res2);
	   }
	   break;
   case 3: 
	   System.out.println("Enter the first digit:");
	   int num5 = sc.nextInt();
	   System.out.println("Enter the second digit:");
	   int num6 = sc.nextInt();
	   int res3 = Calculator.Multiplication(num5,num6);
	   System.out.println(num5+"*"+num6+"="+res3);
	   break;
   case 4:
	   System.out.println("Enter the first digit:");
	   float num7 = sc.nextFloat();
	   System.out.println("Enter the second digit:");
	   int num8 = sc.nextInt();
	   float res4 = Calculator.Division(num7,num8);
	   if(num7>num8) {
	   System.out.println(num7+"/"+num8+"="+res4);
	   }
	   else {
		   System.out.println(num8+"/"+num7+"="+res4); 
	   }
	   
	   break;
   }
   }

}
