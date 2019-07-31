package day4;

public class calc {

	/**
	 * @param args
	 */
	int sum;
	public  int add(int a,int b)
	{
		return(a+b);
	}
	public  int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	public   int add(int a,int b,int c,int d)
	{
		return(a+b+c+d);
	}
	public  float add(float a,int b)
	{
		return(a+b);
	}
	public  float add(float a,float b)
	{
		return(a+b);
	}
	public  float add(int a,float b)
	{
		return(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc first=new calc();
		System.out.println(first.add(3, 5, 5));
		

	}

}
