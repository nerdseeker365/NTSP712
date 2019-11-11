
public class Student implements Comparable<Student>{
	private int sno;
	private String sname;
	private double percentage;
	public Student(int sno, String sname, double percentage) {
		this.sno = sno; 
		this.sname = sname;
		this.percentage = percentage;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", percentage=" + percentage + "]";
	}

	@Override
	public int compareTo(Student s) {
		if(this.getSno()>s.getSno())
		return 1;
		else
		return -1;
	}

}
