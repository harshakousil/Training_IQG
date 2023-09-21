package training.iqgateway.web;

import training.iqgateway.business.AdminOperations;
import training.iqgateway.entities.DepartmentEO;

public class DepartmentVO {
	
	
	private Integer DeptId;
	
	private String deptName;
	
	private Integer mgrId;
	
	private Integer locId;
	
	
	
	private AdminOperations adminOperRef;
	
	@Override
	public String toString() {
		return "DepartmentVO [DeptId=" + DeptId + ", deptName=" + deptName + ", mgrId=" + mgrId + ", locId=" + locId
				+ ", adminOperRef=" + adminOperRef + "]";
	}

	public DepartmentVO(AdminOperations adminOperRef) {
		super();
		this.adminOperRef = adminOperRef;
	}

	public AdminOperations getAdminOperRef() {
		return adminOperRef;
	}

	public void setAdminOperRef(AdminOperations adminOperRef) {
		this.adminOperRef = adminOperRef;
	}

	public DepartmentVO()
	{
		
	}

	public DepartmentVO(Integer deptId, String deptName, Integer mgrId, Integer locId) {
		super();
		DeptId = deptId;
		this.deptName = deptName;
		this.mgrId = mgrId;
		this.locId = locId;
	}

	public Integer getDeptId() {
		return DeptId;
	}

	public void setDeptId(Integer deptId) {
		DeptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getMgrId() {
		return mgrId;
	}

	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}

	public Integer getLocId() {
		return locId;
	}

	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	
	
	public String navigate()
	{
		DepartmentEO deptEORef =new DepartmentEO();
		
		deptEORef.setDepartmentId(this.DeptId);
		deptEORef.setDepartmentName(this.deptName);
		deptEORef.setManagerId(this.mgrId);
		deptEORef.setLocationId(this.locId);
		
		//Invoke bussiness Method
		
		Integer result =adminOperRef.addDepartment(deptEORef);
		
		if(result !=null)
		{
			return "success";
		}
		else
		{
			return "failure";
		}
		
	}
	
	
	

}
