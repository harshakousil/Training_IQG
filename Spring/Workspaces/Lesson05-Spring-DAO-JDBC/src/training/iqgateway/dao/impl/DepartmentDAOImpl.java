package training.iqgateway.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import training.iqgateway.dao.DepartmentDAO;
import training.iqgateway.entities.DepartmentEO;
import training.iqgateway.rowmappers.DepartmentRowMapper;

public class DepartmentDAOImpl implements DepartmentDAO {

	
	private DataSource datasourceRef;
	
	private JdbcTemplate jdbcTemplateRef;
	
	
	
	public DataSource getDatasourceRef() {
		return datasourceRef;
	}

	public void setDatasourceRef(DataSource datasourceRef) {
		this.datasourceRef = datasourceRef;
	}

	public DepartmentDAOImpl(DataSource datasourceRef) {
		super();
		this.datasourceRef = datasourceRef;
		
		
		this.jdbcTemplateRef = new JdbcTemplate(this.datasourceRef);
	}

	
	public DepartmentDAOImpl()
	{
		
	}
	
	
	@Override
	public int insertDepartment(DepartmentEO departmentEORef) {
		
		
		// TODO Auto-generated method stub
		String st ="INSERT INTO DEPARTMENTS VALUES ("+departmentEORef.getDepartmentId()+","+"'"+departmentEORef.getDepartmentName()+"'"+","+departmentEORef.getManagerId()+","+departmentEORef.getLocationId()+")";
		this.jdbcTemplateRef.execute(st);
		return 0;
	}

	@Override
	public int updateDpartment(DepartmentEO departmentEORef) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDepartment(Integer departmentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DepartmentEO findDepartmentyId(Integer departmentId) {
		// TODO Auto-generated method stub
		String st="SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ? ";
	DepartmentEO returnedDepartmentEORef=this.jdbcTemplateRef.queryForObject(st, new Object[]{ departmentId } ,new DepartmentRowMapper());
//		DepartmentEO returnedDepartmentEORef = 
//		        (DepartmentEO)this.jdbcTemplateRef.queryForObject(st, 
//		                new Object[]{ departmentId }, new BeanPropertyRowMapper(DepartmentEO.class));
		return returnedDepartmentEORef;
	}

	@Override
	public List<DepartmentEO> findAll() {
		// TODO Auto-generated method stub
		String st="SELECT * FROM DEPARTMENTS";
		List<DepartmentEO> FindAllResult=this.jdbcTemplateRef.query(st, new DepartmentRowMapper()) ;
		return FindAllResult;
	}

}
