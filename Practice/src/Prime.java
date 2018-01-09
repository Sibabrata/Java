import java.util.Scanner;

public class Prime {

	int a;
	int b;
    int c;
    
	public static void main(String[] args) {
		int count=0;
		int count2=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first Number:");
		int first = sc.nextInt();
		System.out.println("Enter second Number:");
		int last = sc.nextInt();
	    sc.close();	
	    for(int i=first;i<=last;i++){
	    count=0;
		for(int b=2;b<i-1;b++){
			
			if(i%b==0){
				count++;
				
			}//end of if			
			
		}//end of for
	if(count==0){
		System.out.println(i);
	count2++;
	
		//System.out.println("Number is Prime");	
	}//end of if
	
	else{
		
		//System.out.println("Number is not Prime");
	}//end of else
	    }//end of outer for
		
System.out.println("Total Prime Numbers: "+count2);
	}//end of method

}//end of class
