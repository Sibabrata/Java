import java.util.Scanner;


public class Even {

void Even(){
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
	if 	(a%2==0){
System.out.println("Even");
}//end of if
else{
	System.out.println("Odd");
}//end of else
}//end of method
	
	
public static void main (String[] args){

System.out.println("Enter any number");	

Even obj=new Even();
obj.Even();
	
	
	
	
}//end of main
	
		
}//end of class
