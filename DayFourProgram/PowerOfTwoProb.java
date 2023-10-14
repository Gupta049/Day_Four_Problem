import java.util.Scanner;

public class PowerOfTwoProb {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N ");
		int n = sc.nextInt();
		sc.close();
		if(n<31){
			System.out.println("Power Table of 2 ");
			powerOfTwo(n);
		}else{
		System.out.println("Entered value is greater than 31");
		}
	}
	private static void powerOfTwo(int n){
		for(int i=0; i<n; i++){
			double value = Math.pow(2, i);
			System.out.println("2 ^ " + i + " -> " + value);
		}
	}
}
