package day6;

public class tes1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consultant obj1=new consultant(123,"bhaskar", 500);
		fte obj2=new fte(233,"shukla",200);
		obj1.thw=25;
		obj2.tdw=32;
		obj1.detail();
		System.out.println("Salary of consultant = "+obj1.cal_m_sal());
		obj2.detail();
		System.out.println("Salary of full time worker = "+obj2.cal_m_sal());
		

	}

}
