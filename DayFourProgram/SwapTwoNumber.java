import java.util.Scanner;

public class SwapTwoNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the two number ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		swapTwoNumberFun(num1, num2);
	}
	private static void swapTwoNumberFun(int a, int b){
		int c=a+b;
		b=c-b;
		a=c-a;
		System.out.print(a + " "+ b);
	}
}
