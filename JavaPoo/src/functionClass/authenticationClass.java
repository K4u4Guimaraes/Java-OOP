package functionClass;

import interfaces.LoginSecretary;

public class authenticationClass {
	
	private LoginSecretary loginsecretary;
	public boolean authenticator() {
		
		return loginsecretary.authentication();
	}
	
	public authenticationClass(LoginSecretary acess) {
		this.loginsecretary = acess;
	}

}
