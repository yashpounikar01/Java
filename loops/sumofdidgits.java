package loops;

import java.util.Scanner;

public class sumofdidgits {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		int rem,sum=0;
		while(n!=0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
	}
}
