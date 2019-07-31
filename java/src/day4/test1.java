package day4;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b =new yes();
		System.out.println("Interest rate of yes bank is ="+ b.get_roi());
		b=new citi();
		System.out.println("Interest rate of citi bank is ="+ b.get_roi());
	}

}
