package Iteration;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 5; 
		//rows = sc.nextInt();
        int[] numbers = new int[rows];

        
        for (int i = 0; i < rows; i++) {
            numbers[i] = i + 1;
        }

       
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
        }

	}

}
