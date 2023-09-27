package StudentClass;

public class Subject {
	private String subject1;
	private double grade1;
	
	
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public double getGrade1() {
		return grade1;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(grade1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((subject1 == null) ? 0 : subject1.hashCode());
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
		if (subject1 == null) {
			if (other.subject1 != null)
				return false;
		} else if (!subject1.equals(other.subject1))
			return false;
		return true;
		
		
	}
	@Override
	public String toString() {
		return "Subject [subject1=" + subject1 + ", grade1=" + grade1 + "]";
	}

	
	
	
	
	
}
