import java.util.Scanner;

public class LargestAmongThreeProb {
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		//System.out.println
		int n1 =Integer.parseInt(args[0]);
		int n2 =Integer.parseInt(args[1]);
		int n3 =Integer.parseInt(args[2]);
		System.out.print("Bigger Number is "+ biggerNumberFun(n1, n2, n3));
	}

	private static int biggerNumberFun(int a, int b, int c){
		return a>b?a:(b>c?b:c);
	}
}
