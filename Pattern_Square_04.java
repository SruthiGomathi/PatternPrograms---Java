package patternPrograms;
/* Print the following pattern

 * 	n = 5
 * 	1  2  3  4  5
 *  1  2  3  4  5
 *  1  2  3  4  5
 *  1  2  3  4  5
 *  1  2  3  4  5
 *
 */
import java.util.Scanner;

public class Pattern_Square_04 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf(j + " ");
			}
			System.out.println();
		}
	}
}
