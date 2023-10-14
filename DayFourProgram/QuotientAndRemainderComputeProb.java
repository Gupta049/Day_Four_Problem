import java.util.Scanner;

public class QuotientAndRemainderComputeProb {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value that is going to be devide: ");
		int num = sc.nextInt();
		System.out.print("Enter the value of devisor");
		int divisor = sc.nextInt();
		quotientAndRemainderComputeProb(num, divisor);
	}

	private static void quotientAndRemainderComputeProb(int n, int divisor){
		int rem=0, quotient=0;
		quotient=n/divisor;
		rem=n%divisor;
		System.out.println("Quotient of " + n + " is "+ quotient);
		System.out.println("Remainder of "+ n + " is " + rem);
	}
}
