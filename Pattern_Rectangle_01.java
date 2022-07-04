/*  Print the given pattern:
 
Input:
N= 3, M=3
 
Output:
X X X
X 0 X
X X X
Input:
  N=4 M=5 
Output:
X X X X
X 0 0 X
X 0 0 X
X 0 0 X
X X X X

Input:
N=6 M=7

X X X X X X
X 0 0 0 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 X X 0 X
X 0 0 0 0 X
X X X X X X */	

package patternPrograms;
import java.util.Scanner;

public class Pattern_Rectangle_01 {
		static void printPattern(int m,int n) {
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(((i==1) || (i == m-2)) && ((j>0) && j<(n-1)) || (i>1 && i<m-2) && ((j==1) || j==n-2)){
						System.out.print("0");
					}
					else {
						System.out.print("x");
					}
				}
				System.out.println();
			}
		}
		public static void main(String[] args){
			Scanner sc = null;
			try {
				sc = new Scanner(System.in);
				int m = sc.nextInt();
				int n = sc.nextInt();
				printPattern(m,n);
			}
			catch(Exception e) {
				System.out.println("Exception " + e);
			}
			finally {
				sc.close();
			}
		}
}
