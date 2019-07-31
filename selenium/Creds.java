package selenium;

public class Creds {

	String uid,pass,exp,result;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPass() {
		return pass;
	}

	public Creds() {
		
	}
	
	public Creds(String uid, String pass, String exp, String result) {
		this.uid = uid;
		this.pass = pass;
		this.exp = exp;
		this.result = result;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
