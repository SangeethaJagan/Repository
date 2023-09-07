package week3_Day2_Assignment;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Interest changed to 4%");
		System.out.println("Deposit Interest changed for Senior Citized  7%");

	}
	
	public static void main(String[] args) {
		AxisBank A =new AxisBank();
		A.saving();
		A.fixed();
		A.deposit();
		
	}

}
