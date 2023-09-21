package tms.iqgateway.bussiness;

import tms.iqgateway.entities.RoleEO;
import tms.iqgateway.entities.UserEO;

public interface AdminOperations {
	
	public Integer addUser();
	
	public Integer removeUser(UserEO user);
	
	public Integer modifyUser(UserEO user);
	
	public String addRole();
	
	public String modifyRole(RoleEO role);
	
	public String removeRole(RoleEO role);
	

}
