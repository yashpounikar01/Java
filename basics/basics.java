package basics;

import java.util.Scanner;

public class basics {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
	}
}
