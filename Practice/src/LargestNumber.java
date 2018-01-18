import java.io.InputStream;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("enter a number");
			int a = sc.nextInt();
			arr1[i] = a;

		}// end of for

		for (int j = 0; j < 5; j++) {

			System.out.print(arr1[j] + " ");

		}
		System.out.println();
		for (int a : arr1)
			System.out.print(a + " ");

		int l = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (l < arr1[i]) {
				l = arr1[i];
			}
			

		}
		
		int s = Integer.MAX_VALUE;

		for (int i = 0; i < arr1.length; i++) {
			if (l > arr1[i]) {
				s = arr1[i];
			}
			

		}
		
		System.out.println("\nThe largest number is: " + l);
		System.out.println("\nThe smallest number is: " + s);
	}// end of method

}// end of class
