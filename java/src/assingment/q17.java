package assingment;

import java.util.Scanner;

public class q17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the number");
		n=obj.nextInt();
		String s[]=new String[15];
		int i=0;
		while(n!=0)
		{
			
			int l=(n%10);
			n=n/10;
			switch(l)
			{
			case 0:
				s[i]="zero";
				i++;
				break;
			case 1:
				s[i]="one";
				i++;
				break;
			case 2:
				s[i]="two";
				i++;
				break;
			case 3:
				s[i]="three";
				i++;
				break;
			case 4:
				s[i]="four";
				i++;
				break;
			case 5:
				s[i]="five";
				i++;
				break;
			case 6:
				s[i]="six";
				i++;
				break;
			case 7:
				s[i]="seven";
				i++;
				break;
			case 8:
				s[i]="eight";
				i++;
				break;
			case 9:
				s[i]="nine";
				i++;
				break;
			}
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(s[j]);
		}

	}


	}

