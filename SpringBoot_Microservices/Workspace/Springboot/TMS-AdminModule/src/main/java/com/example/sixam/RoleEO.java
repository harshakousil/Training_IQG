package com.example.sixam;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "tm_Rolemaster")
public class RoleEO {

    @Id
    @Column(name = "ROLENAME")
    private String roleName;

    @Column(name = "ROLE_DESC")
    private String roleDescription;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public RoleEO() {
		super();
		
	}

	public RoleEO(String roleName, String roleDescription) {
		super();
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

    
}

