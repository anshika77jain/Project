import java.util.Scanner;

 class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException()
	{
		System.out.println("Insuffient Balance in your Account");
	}

}

public class CustomException {
	
	public static void main(String args[])throws InsufficientBalanceException
	{
		int pmt,wmt,dmt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		pmt=sc.nextInt();
		SavingsAccount s=new SavingsAccount(pmt);
		boolean flag = true;
		while(flag)
		{
		int ch;
		System.out.println("Choose any one:");
		System.out.println("1.To Withdraw the amount");
		System.out.println("2.To Deposit");
		System.out.println("3.Exit");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter withdrawal amount:");
			wmt=sc.nextInt();
			if(wmt>pmt)
			{
				throw new InsufficientBalanceException();
			}
			else
			{
				s.withdraw(wmt);
			}
			break;
		case 2:
			System.out.println("Enter the amount to be deposit:");
			dmt=sc.nextInt();
			
				s.deposit(dmt);
			
			break;
		case 3:flag=false;
		System.out.println("Thank You!");
			break;
		default:
			System.out.println("Wrong Choice!");
			break;
			
		}
		}
		
	}

}
