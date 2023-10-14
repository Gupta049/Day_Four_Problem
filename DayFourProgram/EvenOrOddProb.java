import java.util.Scanner;

public class EvenOrOddProb {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		if(evenOrOddFun(number)){
			System.out.println(number + " is even number");
		}else{
			System.out.println(number + " is odd number");
		}
	}

	private static boolean evenOrOddFun(int n){
		if(n%2 == 0)
			return true;
		else
			return false;
	}
}
