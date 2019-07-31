package DAy3;

public class Account {
	int accno;
	float accbal,int_rate;
	public void get_acc_det()
	{
		String str="Account Number : "+accno+"\n"
				+"Account Balance : "+accbal+"\n"
				+"Intrest_rate : "+int_rate;
		System.out.println(str);
	}
	public float calculate_intrest(float amt)
	{
		return amt*int_rate/100;
	}
	
	

}
