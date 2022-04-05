
public class ProfileCredentials {
	
	private final String name;
	private final String surname;
	private final String CF;
	private final String mail;
	private String password;	
	
	public ProfileCredentials(String name, String surname, String CF, String mail, String password) {
		this.name = name;
		this.surname = surname;
		this.CF = CF;
		this.mail = mail;
		this.password = password;
	}
	
	public String getName() {
		return this.name + this.surname;
	}
	
	public String getCF() {
		return this.CF;
	}
	
	public String getMail(String password) {
		if(password == this.password) {
			return this.mail;
		} else {
			return "password does not match";
		}
	}
	
	public String getPassword(String mail) {
		if(mail == this.mail) {
			return this.password;
		} else {
			return "mail does not match";
		}
	}
	
	public String changePassword(String mail, String password, String newPassword) {
		if(mail == this.mail && password == this.password) {
			this.password = newPassword;
			return "Operation completed successfully";
		} else {
			return "Invalid mail or password";
		}
	}

}
