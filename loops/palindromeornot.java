package loops;

import java.util.Scanner;

public class palindromeornot {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int rem,rev=0,c=n;
		while(n!=0) {
			rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}
		if(c==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
	}
}
