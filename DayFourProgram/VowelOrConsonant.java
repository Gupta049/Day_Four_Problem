import java.util.Scanner;

public class VowelOrConsonant {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an alphabet ");
			char ch =sc.next().charAt(0);
			if(vowelOrConsonant(ch)){
				System.out.println("Entered alphabet is vowel");
			}else{
				System.out.println("entered alphabet is consonant");
			}
		}

		private static boolean vowelOrConsonant(char ch){
			char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
			for(int i=0; i<vowelArray.length; i++){
				if(ch == vowelArray[i])
					return true;
			}
		return false;
		}
}
