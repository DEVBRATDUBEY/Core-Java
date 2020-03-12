import java.util.Scanner;
class Bank
{
	String name;
	int acno, bal, amt;
	Bank(String name1,int acno1,int bal1)
	{

		name=name1;
		acno=acno1;
		bal=bal1;
	}
	void deposit(int amt)
	{
		bal+=amt;
		System.out.println("After Depositing Ur Balance : "+bal);
	}
	void withdraw(int amt)
	{
		if (amt>bal)
		{
			System.out.println("You Dont Have Sufficient Balance !!!");
		}
		else
		{
			bal-=amt;
			System.out.println("After Withdrawing Ur Balance : "+bal);
		}
	}
	void display()
	{
		System.out.println("Name : "+name+"\nAC NO : "+acno+"\nAvailable Balance : "+bal);
	}
}

class TestBank
{
	public static void main(String args[])
	{
		String name;
		int acno,bal,amt,ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Name Of Depositor : ");
		name=s.nextLine();
		System.out.println("Enter Account Number : ");
		acno=s.nextInt();
		System.out.println("Enter Balance : ");
		bal=s.nextInt();
		Bank b=new Bank(name,acno,bal);
		do
		{
			System.out.println("1- Deposit\n2- Withdraw\n3- Exit\n\t\tEnter Your Choice : ");
			ch=s.nextInt();
		switch(ch)
		{
			case 1:
				{
				System.out.println("Enter Amount To Deposit : ");
				amt=s.nextInt();
				b.deposit(amt);	
				b.display();				
				break;				
				}
			case 2:
				{
					System.out.println("Enter Amount To Withdraw : ");
					amt=s.nextInt();
					b.withdraw(amt);
					b.display();
					break;
				}
			case 3:
				{
					System.exit(0);
					break;
				}
			default :
				System.out.println("Wrong Choice !!!!!");
		}
		}while(ch!=3);
	}
}