package practice.blogApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import practice.blogApp.Dto.UserEO;

public interface UsersRepository  extends MongoRepository<UserEO, String> {



}
