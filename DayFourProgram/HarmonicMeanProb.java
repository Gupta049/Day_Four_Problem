import java.util.Scanner;

public class HarmonicMeanProb{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		harmonicMean(n);
	}

	private static void harmonicMean(int n){
		double H=0.0;
		for(int i=1; i<=n; i++){
			H+=1.0/i;
		System.out.println("H"+i+"->" + H);
		}
	}
}
