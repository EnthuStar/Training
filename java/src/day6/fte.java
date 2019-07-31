package day6;

public class fte extends employee{
	fte(int id, String name, int rate) {
		super(id, name, rate);
		// TODO Auto-generated constructor stub
	}

	int tdw;

	
	public int cal_m_sal() {
		// TODO Auto-generated method stub
		int sal=tdw*rateperunit;
		return sal;
	}
	

}
