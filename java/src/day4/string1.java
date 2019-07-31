package day4;

public class string1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am learning Core Java",s1="hello",s2="Hello",s3;
		int l=s.length();
		System.out.println("Lenght = "+ l);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		s3=s.substring(0, 4);
		System.out.println(s3);
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('a',3));
		

	}

}
