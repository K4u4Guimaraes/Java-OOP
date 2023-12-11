package StudentClass;

import interfaces.LoginSecretary;

public class Secretary extends Person implements LoginSecretary{
	
	private String register;
	private String job_level;
	private String experience;
	private String user;
	private String pass;
	
	public Secretary(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}


	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getJob_level() {
		return job_level;
	}
	public void setJob_level(String job_level) {
		this.job_level = job_level;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	@Override
	public String toString() {
		return "Secretary [register=" + register + ", job_level=" + job_level + ", experience=" + experience + "]";
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 1800.0 * 0.9;
	}
	@Override
	public boolean authentication(String user, String pass) {
		this.user = user;
		this.pass = pass;
		return authentication();
		
	}


	@Override
	public boolean authentication() {
		return user.equals("admin") && pass.equals("admin");
	}
	
	
	
	
	

}
