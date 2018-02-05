import java.util.Scanner;

public class Sort {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[5];
		

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter number");
			int a = sc.nextInt();
			arr1[i] = a;

		}// end of for loop

		for (int j = 0; j < 5; j++) {

			System.out.print(arr1[j]+" ");			
			int a= arr1[0];
			int b= arr1[1];
			
			 if (a>b){
				System.out.println(a);
				
			}//end of if
			 else{
				 System.out.println(b);
			 }
			
			
		}// end of for loop
		
		
		
		
		
		
	}

}
