package DAy3;

public class student {

	/**
	 * @param args
	 */
	String Name;
	int marks1,marks2;
	float avg;
	public void Avg()
	{
		avg=((this.marks1+this.marks2)/2.0f);
	}
	public void Displaydetail()
	{
		System.out.println("Name of student = "+ Name +"||Marks1 = " +marks1 + "||Marks2 = "+ marks2+"||average = "+avg);
	}
	public void bestavg( student j)
	{
		if(avg> j.avg)
		{
			System.out.println(Name +" have good avg than "+ j.Name);
		}
		else if(j.avg>avg)
		{
			System.out.println(j.Name +" have good avg than "+ Name);
		}
		else
		{
			System.out.println(Name +" has same avg as "+ j.Name);
		}
	}


}
