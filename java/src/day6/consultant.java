package day6;

public class consultant extends employee{
	consultant(int id, String name, int rate) {
		super(id, name, rate);
		// TODO Auto-generated constructor stub
	}
	int thw;
	public int cal_m_sal() {
		// TODO Auto-generated method stub
		int sal=thw*rateperunit;
		return sal;
	}

}
