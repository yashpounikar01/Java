package loops;

import java.util.Scanner;

public class primebetween {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter initial and final number:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i,j;
		for (i=n1;i<=n2;i++) {
			for (j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
				
			}
			if(i==j) {
				System.out.println(i);
			}
		}
	}
}
