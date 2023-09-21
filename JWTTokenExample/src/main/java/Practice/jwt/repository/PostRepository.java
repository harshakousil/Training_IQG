package Practice.jwt.repository;

import Practice.jwt.dto.PostEO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<PostEO, String> {

    public List<PostEO> findAll();



}
