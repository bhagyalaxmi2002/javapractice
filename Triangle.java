package ctrlstmt;

public class Triangle {

	public static void main(String[] args) {
		int angle1 = 45;
		int angle2 = 85;
		int angle3 = 50;
		if(angle1 + angle2 + angle3 == 180) {
			System.out.println("Given angles can form a triangle");
		}
		else {
			System.out.println("Given angles cannot form a triangle");
		}
	}

}
