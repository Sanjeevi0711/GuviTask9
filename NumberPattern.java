package GuviTask9;

import java.util.Scanner;

public class NumberPattern {
	public static void main(String args[]) {
		int n = 4;
		Scanner sc= new Scanner(System.in);
		int s = sc.nextInt();
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(j); 
			}
			System.out.println();
		}
	}

}
