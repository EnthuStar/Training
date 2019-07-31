package DAy3;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sbacc acc1=new sbacc();
		acc1.accno=1234567890;
		acc1.accbal=34567;
		acc1.int_rate=10;
		acc1.get_acc_det();
		acc1.withdraw(1000);
		acc1.get_acc_det();
		acc1.deposit(500);
		acc1.get_acc_det();

	}

}
