package day5_1;
import day5.parentclass;
public class child_class2 extends parentclass {
	
	public void Detail(){
	//	Display();
		//System.outprintln(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String args[])
	{
		child_class2 p1=new child_class2();
		//p1.Display();
		//System.out.println(p1.b);
		System.out.println(p1.c);
		System.out.println(p1.d);
		
	}
}
