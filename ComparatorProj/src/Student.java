
public class Student {
	private String sname;
	private int sno;
	
	public Student(String sname, int sno) {
		this.sname = sname;
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + "]";
	}
	

}
