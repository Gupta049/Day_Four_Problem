import java.util.Scanner;

public class FlipCoinProgram {
    static double constant = 0.5;
    public static void main(String[] args) {
        System.out.print("Enter the number of times to Flip Coin ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0 ){
            avgFunction(n);
        }else{
            System.out.println("Sorry, please again enter the positive number");
        }
        sc.close();
    }
    private static void avgFunction(int n){
        int headCount=0;
        int tailCount=0;
        for(int i=0; i<n; i++){
            double numberInBetween = Math.random();
            if(numberInBetween < constant ){
                headCount++;
            }else{
                tailCount++;
            }
        }
        double perOfHead, perOfTail;
        perOfHead = ((double)headCount/n)*100;
        perOfTail = ((double)tailCount/n)*100;
        System.out.println("Percentage of occuring Head is " + perOfHead);
        System.out.println("Percentage of occuring Tail is " + perOfTail);
    }
}

