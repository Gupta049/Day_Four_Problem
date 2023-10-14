/*
Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 */
import java.util.Scanner;

public class LeapYearProb {
    public static void main (String[] args){
        System.out.print("Enter the value to be checked is it leap year or not ");
        Scanner sc = new Scanner(System.in);
   		String yrs=sc.nextLine();
        int n = Integer.parseInt(yrs);
        sc.close();
		if(yrs.length() == 4){
        if( n % 4 == 0 && n % 100 !=0 || n % 400  == 0){
            System.out.println("Entered number " + n + " is leap year ");
        }else{
            System.out.println("Entered number "+ n + " is not leap year ");
        }}else{
			System.out.println("Entered number length must be 4");
		}
    }
}
