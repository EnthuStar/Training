package day6;

public abstract class employee {
	int eid;
	int rateperunit;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getRateperunit() {
		return rateperunit;
	}
	public void setRateperunit(int rateperunit) {
		this.rateperunit = rateperunit;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	String e_name;
	employee(int id,String name,int rate)
	{
		eid=id;
		e_name=name;
		rateperunit=rate;
	}
	public void detail()
	{
		System.out.print("e_id = "+eid+ " e_name = "+e_name+" ");
	}
	abstract public  int cal_m_sal();
	

}
