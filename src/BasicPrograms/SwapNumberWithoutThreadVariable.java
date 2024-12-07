package BasicPrograms;

import java.util.Scanner;

public class SwapNumberWithoutThreadVariable {

	public static void main(String[] args) {
		
		// swap two numbers without 3rd variable
		
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		//System.out.println("Before swap a= :" +a);
		//System.out.println("Before swap b=:" +b);
		System.out.println("Before swap : :" +a + " " +b );
		// logic
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap a =" +a);
		System.out.println("After swap b ="+b);
		
		
		
	}

}
