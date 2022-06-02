import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
