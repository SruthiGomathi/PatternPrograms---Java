package patternPrograms;
/* Print the following pattern

 * 	n = 5
 * 	5  4  3  2  1
 *  5  4  3  2  1
 *  5  4  3  2  1
 *  5  4  3  2  1
 *  5  4  3  2  1
 *
 */
import java.util.Scanner;

public class Pattern_Square_06 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number...");
		int n= sc.nextInt();
		sc.close();
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				System.out.printf(j + " ");
			}
			System.out.println();
		}
	}
}
