package BasicPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
	//Swap two numbers using temp variable
		
		int a;
		int b;
		
		System.out.println("Enter first number:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		System.out.println("Enter second Number");
		b= scan.nextInt();
		
		//Before swapping 
		
		System.out.println("Before swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//swapping
		
		int temp = a;
		a = b;
		b = temp;
		
		// After swapping 
		System.out.println("After swap");
		System.out.println("a =" +a);
		System.out.println("b =" +b);
			
		
	}
	
	
	
}