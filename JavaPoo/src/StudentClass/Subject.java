package StudentClass;

public class Subject {
	private String subject1;
	private String subject2;
	private String subject3;
	private String subject4;
	private double grade1;
	private double grade2;
	private double grade3;
	private double grade4;
	
	
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject3() {
		return subject3;
	}
	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}
	public String getSubject4() {
		return subject4;
	}
	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}
	public double getGrade1() {
		return grade1;
	}
	public void setGrade1(String pattern_grade1){
		double tgrade = Double.parseDouble(pattern_grade1);
		this.grade1 = tgrade;
	}
	public double getGrade2() {
		return grade2;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	public double getGrade3() {
		return grade3;
	}
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	public double getGrade4() {
		return grade4;
	}
	public void setGrade4(double grade4) {
		this.grade4 = grade4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(grade1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grade2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grade3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grade4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((subject1 == null) ? 0 : subject1.hashCode());
		result = prime * result + ((subject2 == null) ? 0 : subject2.hashCode());
		result = prime * result + ((subject3 == null) ? 0 : subject3.hashCode());
		result = prime * result + ((subject4 == null) ? 0 : subject4.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (Double.doubleToLongBits(grade1) != Double.doubleToLongBits(other.grade1))
			return false;
		if (Double.doubleToLongBits(grade2) != Double.doubleToLongBits(other.grade2))
			return false;
		if (Double.doubleToLongBits(grade3) != Double.doubleToLongBits(other.grade3))
			return false;
		if (Double.doubleToLongBits(grade4) != Double.doubleToLongBits(other.grade4))
			return false;
		if (subject1 == null) {
			if (other.subject1 != null)
				return false;
		} else if (!subject1.equals(other.subject1))
			return false;
		if (subject2 == null) {
			if (other.subject2 != null)
				return false;
		} else if (!subject2.equals(other.subject2))
			return false;
		if (subject3 == null) {
			if (other.subject3 != null)
				return false;
		} else if (!subject3.equals(other.subject3))
			return false;
		if (subject4 == null) {
			if (other.subject4 != null)
				return false;
		} else if (!subject4.equals(other.subject4))
			return false;
		return true;
	}
	
	
}
