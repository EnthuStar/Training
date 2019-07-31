package day2;
import java.util.*;
public class input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][] A= new int[20][20];
		String[] B = new String[100];
		System.out.println("Enter no. of Students");
		int n=input.nextInt();
		System.out.println("No. of Subjects");
		int s=input.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter Name of Student" + i);
			B[i]=input.next();
			for(int j=1;j<=s;j++)
			{
				System.out.println("Enter Marks of subject" + j);
				A[i][j]=input.nextInt();
			}
			
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println(B[i]);
			for(int j=1;j<=s;j++)
			{
				System.out.println(A[i][j]);
			}
			
		}
		

	}

}
