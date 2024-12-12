package loops;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println("Fibonacci Series:");
		System.out.println(a);
		System.out.println(b);
		
		for (int i=3;i<=n;i++) {
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}
