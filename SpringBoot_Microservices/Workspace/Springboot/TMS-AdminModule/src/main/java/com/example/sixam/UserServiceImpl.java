package com.example.sixam;

import java.util.List;


import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.Transactional;
import javax.transaction.UserTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sixam.RoleRepository;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepRef;
    
    @Autowired 
    public RoleRepository roleRepositoryRef;
  
      
    public UserEO addUser(UserEO user) {
    	user.setRoleName(user.getRoleName().toUpperCase());
        return userRepRef.save(user);
    }

    public void modifyUser(UserEO user) {
         userRepRef.updateUser(user);
    }

    public List<UserEO> getAllUsers() {
        return (List<UserEO>) userRepRef.findAll();
    }

   @Transactional
    public int  deleteUser(String username) {
    	
			return userRepRef.deleteByUsername(username);
			
   }
       
     
    

    public UserEO getByUserName(String username) {
        return userRepRef.findByusername(username);
        
      
    }


	public String LoginValidation(String username,String password) {
		// TODO Auto-generated method stub
		return userRepRef.findRoleNameByUser(username,password);
	}

	@Override
	public List<String> getAllRoles() {
		
		return userRepRef.findAllRoles();
	}

}
