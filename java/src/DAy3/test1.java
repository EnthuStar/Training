package DAy3;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj1=new student();
		student obj2=new student();
		obj1.Name="Bhaskar Shukla";
		obj1.marks1=76;
		obj1.marks2=87;
		obj2.Name="Vipul Shukla";
		obj2.marks1=68;
		obj2.marks2=89;
		obj1.Avg();
		obj2.Avg();
		obj1.Displaydetail();
		obj2.Displaydetail();
		obj1.bestavg(obj2);

	}

}
