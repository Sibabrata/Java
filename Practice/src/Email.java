import java.util.Scanner;


public class Email {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);		
System.out.println("Enter your mail id:");
String str = sc.nextLine();
 


if(str.contains("@gmail.com") || str.contains("@yahoo.com")|| str.contains("@hotmail.com")){

char ch=str.charAt(0);	
if(ch!='@'){
	System.out.println("Valid Email Id");
}
	

else {
System.out.println("Invalid Email id");
}		

}//end of outer if

else {
System.out.println("Invalid Email id");
}	

	}//end of main

}//end of class
