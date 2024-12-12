package loops;

import java.util.Scanner;

public class armstrong {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int c=n;
		int rem,arm=0;
		while (n!=0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n/=10;
		}
		if (c==arm) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("not a Armstrong Number");
		}
	}
}
