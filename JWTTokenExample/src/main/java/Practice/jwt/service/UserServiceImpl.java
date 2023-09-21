package Practice.jwt.service;

import Practice.jwt.dto.UserEO;
import Practice.jwt.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements   UserService{

@Autowired
    UsersRepository usersRepository;
    @Override
    public UserEO adduser(UserEO userDetails) {

        try {
             UserEO newUser = usersRepository.save(userDetails);
            return  newUser;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    return  null;
    }

    @Override
    public UserEO findUser(String email) {
        return  usersRepository.findByEmail(email);
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
