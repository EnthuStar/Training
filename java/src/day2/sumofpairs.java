package day2;

public class sumofpairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={10,20,30,40,50,15,25,35,45,55};
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<i ;j++)
			{
				if((A[i]+A[j])==65)
				{
					System.out.println(A[i] + " + " + A[j] + " = 65");
				}
			}
		}
		

	}

}
