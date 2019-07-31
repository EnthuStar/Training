package day2;

public class array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={20,10,30,12,50,60};
		int sum=0;
		for(int i=0;i<6;i++)
		{
			sum=sum+A[i];
		}
		float avg=sum/5.0f;
		for(int i=0;i<6;i++)
		{
			if(A[i]>=avg)
			{
				System.out.print(A[i]+" ");
			}
		}

	}

}
