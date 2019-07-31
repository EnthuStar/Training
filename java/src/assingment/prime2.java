package assingment;

public class prime2 {
	public static boolean Prime(int x)
	{
		//boolean z=false;
		int k=0;
		for(int j=2;j<=x/2;j++)
		{
			if(x%j==0)
				k=1;
		}
		if(k==1)
			return false;
		else
			return true;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		int a[]=new int[30];
		for(int i=2;i<30;i++)
		{
			if(Prime(i))
			{
				a[j]=i;
				j++;	
			}
		}
		j=1;
		for(int i=1;i<=8;i++)
		{
			if(i%3!=0)
			{
				System.out.print(a[j]+"  ");
				j++;
			}
			else
			{
				System.out.print(a[j]+a[j+1]+"  ");
				j=j+2;
			}
			
		}

	}

}
