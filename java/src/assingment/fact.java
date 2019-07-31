/*

*/
package assingment;

public class fact {

	/**
	 * @param args
	 */
	public static int Fact(int n)
	{
		int facto;
		if(n>1)
		{
			System.out.print(n+" * ");
			facto=n*Fact(n-1);
			
		}
		else
		{
			facto=1;
		}
		return facto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.print("5! = ");
		int f=Fact(n);
		
		System.out.print("1 = "+f);
		

	}

}
