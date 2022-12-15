package project_1;

import java.util.Scanner;
public class factorial
{
     public static void main(String []args)
     {
        Scanner Sc =new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num=Sc.nextInt();
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);  
     }   
}