package assingment;

public class prime {

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
			int k=0,sum=0,i=2;
			while(k<10)
			{
				if(Prime(i))
				{
					if(k>4)
					{
						sum=sum+i;
						System.out.println(i);
					}
						i++;
					k++;
					
				}
				else
				{
					i++;
				}
					
			}
			
			System.out.println(sum);

		}

	}
