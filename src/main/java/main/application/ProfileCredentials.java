
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
	
	public String getMail() {
		return this.mail;

	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String retrievePassword(String mail) {
		if(mail == this.mail) {
			return this.getPassword();
		}
		return "Wrong eMail";
	}
	
	public boolean changePassword(String oldPassword, String newPassword, String newPasswordConf) {
		if(oldPassword == this.password && newPassword != this.password && newPassword == newPasswordConf) {
			this.password = newPassword;
			return true;
		}
		return false;
	}
	
	
}
