package training.iqgateway.entities;

public class RoleEO {
    
    private String roleName;
    
    private String roleDescription;
    
    public RoleEO() {
        
    }

    public RoleEO(String roleName, String roleDescription) {
        super();
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getRoleDescription() {
        return roleDescription;
    }
}
