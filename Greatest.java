package Iteration;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Enter First number:");
		num1 = sc.nextInt();
		System.out.println("Enter Second number: ");
		num2 = sc.nextInt();
		System.out.println("Enter Third number: ");
		num3 = sc.nextInt();
		/*--------------------------------------------------------------*/
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("The greatest number is " + num1);
			}
			else
			{
				System.out.println("The greatest number is " + num3);
			}
		}
		if(num2>num3) {
			System.out.println("The greatest number is " + num2);
		}
		else {
			System.out.println("The greatest number is " + num3);
		}
	}

}
