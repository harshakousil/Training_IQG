package com.example.sixam;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserEO, String> {
	
	@Query("SELECT o FROM UserEO o WHERE "+ "LOWER(o.username) = LOWER(:givenName)")
	UserEO findByusername(@Param("givenName") String gName);
	

	@Query("SELECT r.roleName FROM RoleEO r")
	List<String> findAllRoles();
    
	 @Modifying
	    @Query("delete from UserEO u where u.username = :givenUName")
	    Integer deleteByUsername(@Param("givenUName") String uname);  
	//Integer deleteByUsername(String username);
	
	 @Query("SELECT u.roleName FROM UserEO u WHERE LOWER(u.username) = LOWER(:username) AND u.password = :password")
	    String findRoleNameByUser(@Param("username") String username, @Param("password") String password);
	    
	
	@Modifying
	@Query("UPDATE UserEO u SET u.password = :#{#user.password}, u.roleName = :#{#user.roleName} WHERE u.username = :#{#user.username}")
	void updateUser(@Param("user") UserEO user);
 
	 
	

}
