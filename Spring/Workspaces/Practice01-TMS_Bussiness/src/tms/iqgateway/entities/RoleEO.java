package tms.iqgateway.entities;

public class RoleEO {
	
	private String roleName;
	
	private String roleDesc;
	
	public RoleEO()
	{
		
	}

	public RoleEO(String roleName, String roleDesc) {
		super();
		this.roleName = roleName;
		this.roleDesc = roleDesc;
	}

	@Override
	public String toString() {
		return "RoleEO [roleName=" + roleName + ", roleDesc=" + roleDesc + "]";
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

}
