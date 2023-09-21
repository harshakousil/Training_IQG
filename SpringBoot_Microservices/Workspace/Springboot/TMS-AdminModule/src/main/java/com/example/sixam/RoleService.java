package com.example.sixam;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface RoleService {

	public RoleEO addRole(RoleEO roleRef);
	
	public String deleteRole(String roleName);
	
	public int modifyRole(String roleName, String roleDesc);
	
//	public RoleEO getRole(String roleName);
	
	public List<RoleEO> getAllRoles();
	
}
