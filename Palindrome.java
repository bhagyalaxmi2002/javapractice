package Iteration;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,rem,rev =0;
		System.out.println("Enter your number: ");
		num= sc.nextInt();
		int m = num;
		while(num>0) {
			rem = num % 10;
			rev = (rev*10) + rem;
            num = num/10;			
			
		}
		if(m == rev) {
		System.out.println("Entered number " +m +"is palindrome");
		
	}
		else {
			System.out.println("Entered number" +m + " is not a palindrome");
		}
		
}
}