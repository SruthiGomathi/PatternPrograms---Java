package patternPrograms;

import java.util.Scanner;

/* Print the following pattern
  	n = 5
   * * * * *
   * * * * *
   * * * * *
   * * * * *
   * * * * *
 
 */
public class Pattern_Square_01 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
