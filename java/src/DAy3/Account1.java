package DAy3;

public class Account1 {
		int accno;
		float accbal,int_rate;
		public Account1(int account_no)
		{
			accno=account_no;
			
		}
		public Account1(int account_no,float acc_bal,float intrate)
		{	
			accno=account_no;
			accbal=acc_bal;
			int_rate=intrate;
			
		}
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



