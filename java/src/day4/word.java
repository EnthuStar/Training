package day4;

public class word {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String s="I am learning Java in GlobalLogic";
		s=s+" ";
		
			while(i<s.length())
			{	
				int k=s.indexOf(' ', i);
				if(k!=-1)
				{
					System.out.println(s.substring(i,k));
					i=k+1;
				}
				/*else
				{
					System.out.println(s.substring(i,s.length()));
					break;
				}*/
				
			}
		

	}

}
