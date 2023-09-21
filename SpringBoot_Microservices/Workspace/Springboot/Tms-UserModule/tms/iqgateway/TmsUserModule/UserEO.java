package tms.iqgateway.TmsUserModule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data

@Entity
@Table(name = "TM_USERMASTER")
public class UserEO {
    @Id
    @Column(name = "USERNAME")
    private String username;
    
    @Column(name = "PASSWORD")
    private String password;

    @Override
	public String toString() {
		return "UserEO [username=" + username + ", password=" + password + ", roleName=" + roleName + "]";
	}

	@Column(name = "ROLENAME")
    private String roleName;

    public UserEO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserEO(String username, String password, String roleName) {
		super();
		this.username = username;
		this.password = password;
		this.roleName = roleName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
}
