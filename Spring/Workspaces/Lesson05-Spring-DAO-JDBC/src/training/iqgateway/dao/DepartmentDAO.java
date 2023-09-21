package training.iqgateway.dao;

import java.util.List;

import training.iqgateway.entities.DepartmentEO;

public interface DepartmentDAO {
	
	
	public int insertDepartment(DepartmentEO departmentEORef);
	
	public int updateDpartment(DepartmentEO departmentEORef);
	
	public int deleteDepartment(Integer departmentId);
	
	public DepartmentEO findDepartmentyId(Integer departmentId);
	
	public List<DepartmentEO> findAll();
	

}
