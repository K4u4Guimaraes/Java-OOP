package StudentClass;

public class Director extends Person {
	private String register;
	private String workload;
	private String titration;
	
	
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getWorkload() {
		return workload;
	}
	public void setWorkload(String workload) {
		this.workload = workload;
	}
	public String getTitration() {
		return titration;
	}
	public void setTitration(String titration) {
		this.titration = titration;
	}
	
	@Override
	public String toString() {
		return "Director [register=" + register + ", workload=" + workload + ", titration=" + titration + "]";
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 3900.78;
	}
	
	

}
