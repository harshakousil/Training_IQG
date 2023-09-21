package tms.iqgateway.entities;

public class UserEO {
	
	private String userName;
	
	private String password;
	
	private String RoleName;
	
	public UserEO()
	{
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	public UserEO(String userName, String password, String roleName) {
		super();
		this.userName = userName;
		this.password = password;
		RoleName = roleName;
	}

	@Override
	public String toString() {
		return "UserEO [userName=" + userName + ", password=" + password + ", RoleName=" + RoleName + "]";
	}

	
	
}
