package day2;

public class grades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float marks = 99.0f;
		if(marks>75)
		{
			System.out.println("FCD");
		}
		else
		{
			if(marks>60)
			{
				System.out.println("FC");
			}
			else
			{
				if(marks>50)
				{
					System.out.println("SC");
				}
				else
				{
					if(marks>35)
					{
						System.out.println("Pc");
					}
					else
					{
						System.out.println("F");
					}
				}
			}
		}
		

	}

}
