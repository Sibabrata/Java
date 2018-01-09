import java.util.Scanner;  

public class A {
	
@SuppressWarnings("resource")
public static void main (String[] args)	{
	
Scanner sc= new Scanner(System.in);
System.out.println("Enter rows number");	
int number= sc.nextInt();
//char a= sc.next().charAt(0);


	for(int i=1;i<=number;i++){

	for(int j=1;j<=i;j++){
		
	System.out.print("*");	
		
	}//end of inner for	
				
System.out.println("");		

	}//end of outer for
}//end of main
}//end of class
