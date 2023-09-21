package tms.iqgateway.bussiness;

import tms.iqgateway.entities.RoleEO;
import tms.iqgateway.entities.UserEO;

public class AdminOperationsImpl implements AdminOperations {

	
	
	private RoleEO roleEORef;
	
	 public AdminOperationsImpl()
	 {
		 
	 }
	 
	 
	public AdminOperationsImpl(RoleEO roleEORef) {
		super();
		this.roleEORef = roleEORef;
		System.out.println("We are using " + roleEORef.getClass()+ " Class ");
	}


	@Override
	public Integer addUser() {
		// TODO Auto-generated method stub
		System.out.println("User added sucessfully");
		return 0;
	}

	@Override
	public Integer removeUser(UserEO user) {
		// TODO Auto-generated method stub
		System.out.println("user Removed Sucessfully");
		return 0;
	}

	@Override
	public Integer modifyUser(UserEO user) {
		// TODO Auto-generated method stub
		System.out.println("User Modifued Sucessfully");
		return 0;
	}

	@Override
	public String addRole() {
		// TODO Auto-generated method stub
		System.out.println("Role added Sucessfully");
		return null;
	}

	@Override
	public String modifyRole(RoleEO role) {
		System.out.println("Role Modified Sucessfully");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeRole(RoleEO role) {
		// TODO Auto-generated method stub
		System.out.println("Role Deleted Sucessfully");
		return null;
	}

}
