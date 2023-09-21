package Practice.jwt.repository;

import Practice.jwt.dto.UserEO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository  extends MongoRepository<UserEO, String> {

    @Query("{'email': ?0}")
    public UserEO findByEmail(String email);

}
