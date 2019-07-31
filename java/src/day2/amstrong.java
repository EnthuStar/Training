package day2;
import java.util.*;
public class amstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int n= obj.nextInt();
		int k=n;
		int sum=0;
		while(n!=0)
		{
			
			int l=(n%10);
			n=n/10;
			sum=sum+(l*l*l);
		}
		if(sum==k)
		{
			System.out.println("YES Amstrong Number");
		}
		else
		{
			System.out.println("No Not an Amstrong Number");
		}
	}

}
