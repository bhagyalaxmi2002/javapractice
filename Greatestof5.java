package ctrlstmt;

public class Greatestof5 {

	public static void main(String[] args) {
		int n1 = 15;   
		int n2 = 25;
	        int n3 = 50;
	        int n4 = 10;
	        int n5 = 30;
		
		    int greatest = n1;
		    if(n2>greatest) {
		    	greatest = n2;
		    }
		    if(n3>greatest) {
		    	greatest = n3;
		    }
		
		
		    if(n4>greatest) {
		    	greatest = n4;
		    }
		
		    if(n5>greatest) {
		    	greatest = n5;
		    }
		
		
		System.out.println("the greatest of the given number is:"  + greatest);
		
        }

     }
