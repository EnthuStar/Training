package day5;

public class ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10,b=0,c;
			int[] b1={1,2,3,4,5};
			System.out.println(a);
			c=a/b;
			System.out.println(c);
			System.out.println(b1[4]);
			//System.out.println(b1[5]);
			System.out.println("Hello");
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch block-ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("in catch block-ArrayIndexOutOfBoundsException");
		}
		
		System.out.println("out of catch block");

	}

}
