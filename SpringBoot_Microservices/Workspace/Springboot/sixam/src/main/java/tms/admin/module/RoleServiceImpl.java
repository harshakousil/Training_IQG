package tms.admin.module;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepositoryRef;
	
	@Override
	public RoleEO addRole(RoleEO roleRef) {
		// TODO Auto-generated method stub
		return  roleRepositoryRef.save(roleRef);
		
	}

	@Override
	public String deleteRole(String roleName) {
		// TODO Auto-generated method stub
		
//		roleRepositoryRef.deleteById(roleName);
		try {
            roleRepositoryRef.deleteById(roleName);
            return "Success"; // Successful deletion
        } catch (Exception e) {
            return "failure"; // Failed to delete role
        }
		
	}

	@Override
	public int modifyRole(String roleName,String roledesc) {
		return roleRepositoryRef.modifyByRolename(roleName,roledesc);
	}

//	@Override
//	public RoleEO getRole(String roleName) {
//		// TODO Auto-generated method stub
//		RoleEO rolename = roleRepositoryRef.findByRoleName(roleName);
//		
//		return rolename;
//	}

	@Override
	public List<RoleEO> getAllRoles() {
		// TODO Auto-generated method stub
		return  (List<RoleEO>) roleRepositoryRef.findAll();
	}
	
}
