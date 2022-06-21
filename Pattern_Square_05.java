package patternPrograms;
/* Print the following pattern

 * 	n = 5
 * 	5  5  5  5  5
 *  4  4  4  4  4
 *  3  3  3  3  3
 *  2  2  2  2  2
 *  1  1  1  1  1
 *
 */
import java.util.Scanner;

public class Pattern_Square_05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n= sc.nextInt();
		sc.close();
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n;j++) {
				System.out.printf(i + " ");
			}
			System.out.println();
		}
	}
}
