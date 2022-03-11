package week3.assignments;

public class AxisBank extends BankInfo {
	public void deposit() 
	{
		System.out.println("Deposit amount: 2500 - AxisBank Class");
	}

	public static void main(String[] args) {
		System.out.println("Method Override");
		AxisBank bank1 = new AxisBank();
		bank1.saving();
		bank1.fixed();
		bank1.deposit();
	}
}
