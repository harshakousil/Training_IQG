package com.example.sixam;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public interface RoleRepository extends CrudRepository<RoleEO,String> {

	
	@Query("SELECT o FROM RoleEO o WHERE"
			+ " LOWER(o.roleName) = LOWER(:givenName)")
	RoleEO  findByRoleName(@Param("givenName") String givenName);
	
	
	
	@Modifying
	@Query("UPDATE RoleEO o set roleDescription = :roleDesc WHERE "
			+ "  LOWER(o.roleName) = LOWER(:roleName) ")
	Integer modifyByRolename(@Param("roleName") String RoleName,@Param("roleDesc") String RoleDesc);
	

	
}
