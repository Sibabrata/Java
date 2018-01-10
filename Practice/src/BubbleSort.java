import java.util.Scanner;


public class BubbleSort {

	
	public static void main (String[] args){
		
		int arr[]=new int[5];
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++){
		System.out.println("Enter an array");
		int a = sc.nextInt();
		arr[i]=a;		
		}
		
		for(int i=0;i<5;i++){
			System.out.print(arr[i]+" ");
			
			}
		
		
	}
	
	
}
