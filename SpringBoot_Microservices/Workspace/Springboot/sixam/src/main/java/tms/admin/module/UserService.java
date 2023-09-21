package tms.admin.module;

import java.util.List;

public interface UserService {

    // Method to add a new user
    public UserEO addUser(UserEO user);

    // Method to modify an existing user
    public void modifyUser(UserEO user);

    // Method to get a list of all users
    public List<UserEO> getAllUsers();

    // Method to delete a user by their username
    public int  deleteUser(String username);

    // Method to get a user by their username
    public UserEO getByUserName(String username);
    
    //Method to Login
    public String LoginValidation(String username,String password);
    
    //To get all Roles
    public List<String> getAllRoles();
    
}
