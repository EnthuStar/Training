package DAy3;

public class sbacc extends Account {
	public boolean withdraw(float withdraw_amt)
	{
		if(accbal-withdraw_amt>=500)
		{
			accbal=accbal-withdraw_amt;
			return true;
		}
		return false;
	}
	public void deposit(float deposit)
	{
		accbal=accbal+deposit;
	}
	
}
