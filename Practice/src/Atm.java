import java.util.Scanner;

public class Atm {

	int TotalAmount = 5000;

	void Calculate(int EnteredAmount) {
		int RemainingAmnt = TotalAmount - EnteredAmount;
		System.out.println("RemainingAmount:"+RemainingAmnt);

	}

	public static void main(String[] args) {
		Atm a = new Atm();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Amount");

		int EnteredAmount = sc.nextInt();
		sc.close();

		if (EnteredAmount <= a.TotalAmount) {
			System.out.println("Sufficient Balance");
			a.Calculate(EnteredAmount);

		}// end of if
		else
			System.out.println("Insufficient Balance");

	}

}
