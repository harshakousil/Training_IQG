package Practice.jwt.service;


import Practice.jwt.dto.UserEO;

public interface UserService {

    public UserEO adduser(UserEO userDet);

    public UserEO findUser(String email);

    public String DeleteUser(String email);

}
