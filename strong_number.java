package project_1;
import java.util.Scanner;
public class strong_number {

	public static void main(String[] args) {
		int num,temp,fact,rem, sum=0;	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
        temp=num; // storing the value of num into the temporary variable
        //temp is temporary variable
        while(num!= 0) //checking whether the number is not equal to 0    
        {
        rem=num%10; //finding the reminder and stroring the value in "rem"
        fact=1; //setting the value of factorial as 1
        for(int i=1;i<=rem;i++)
        {
        fact=fact*i;
        }
        sum=sum+fact; 	 	
        	num = num/10; //getting quotient(vag fol)
        }
       
       if(sum==temp) //checking the original number is equals to the sum	
       {
    	   System.out.println(temp + " is a strong number");
       }
       else
       {
    	   System.out.println(temp + " is not a strong number");
       }
	}

}





