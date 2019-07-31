package day4;

public class frequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0,k=0,i=0;
		String s="I am learning Core Java";
		while(p!=-1)
		{
			p=s.indexOf('e', i);
			if(p!=-1)
			{
				i=p+1;
				k++;
			}
			
		}
		System.out.println("Frequency of e is = " +k);

	}

}
