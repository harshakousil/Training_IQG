package practice.blogApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.blogApp.Dto.UserEO;
import practice.blogApp.Repository.PostRepository;
import practice.blogApp.Repository.UsersRepository;

import java.util.EmptyStackException;
import java.util.Optional;

@Service
public class UserServiceImpl implements   UserService{


    UsersRepository usersRepository;
    @Override
    public UserEO adduser() {
        return null;
    }

//    public Optional<UserEO> findByEmail(String email) {
//
//        Optional<UserEO> userDetails=usersRepository(email);
//        if(userDetails.isEmpty())
//        {
//            return Optional.ofNullable(null);
//        }
//        return  userDetails;
//    }


    @Override
    public String DeleteUser(String email) {
        return null;
    }
}
