import java.util.Scanner;


public class Atm {
	Scanner sc= new Scanner(System.in); 
	int TotalAmount= sc.nextInt();
	int EnteredAmount= sc.nextInt();
	
	void Calculate(){
		int RemainingAmnt= TotalAmount- EnteredAmount;
		System.out.println(TotalAmount);
		System.out.println(RemainingAmnt);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Atm a= new Atm();
		a.Calculate();
		
		if (a.EnteredAmount<a.TotalAmount){
			System.out.println("Sufficient Balance");
						
		}//end of if 
		else
			System.out.println("Insufficient Balance");
		
		
	}

}
