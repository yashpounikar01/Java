package loops;

import java.util.Scanner;

public class fibonnacciuptoN {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N");
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int c = a+b;
		System.out.println("Fibonacci Series:");
		System.out.println(a);
		System.out.println(b);
		while (c<=n) {
			System.out.println(" "+c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
