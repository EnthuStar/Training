package day2;

public class divde {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=10;i<=30;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
		
	}

}
