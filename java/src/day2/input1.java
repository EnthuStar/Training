package day2;
import java.util.*;
public class input1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		String A,D=" ";
		float avg;
		float max=0.0f;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the name of Students");
			A= input.next();
			System.out.println("Enter the marks of Students");
			a=input.nextInt();
			b=input.nextInt();
			c=input.nextInt();
			d=input.nextInt();
			avg=(a+b+c+d)/4;
			if(max<avg)
			{
				max=avg;
				D=A;
				
			}
			
			
		}
		System.out.println("Avg=" + max);
		System.out.println(D);
		
		
	}

}
