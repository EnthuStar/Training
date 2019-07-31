package day2;
public class electricity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit = 500;
		float bill;
		if(unit>250)
		{
			bill=(100*1.5f)+(100*2)+(50*2.5f)+(4*(unit-250));
		}
		else if(unit>200)
		{
			bill=(100*1.5f)+(100*2)+(2.5f*(unit-200));
		}
		else if(unit>100)
		{
			bill=(100*1.5f)+(2*(unit-100));
		}
		else
		{
			bill=unit*1.5f;
		}
		System.out.println(bill);
		
	

}
}
