package practice.blogApp.Repository;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import practice.blogApp.Dto.PostEO;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<PostEO, String> {

    public List<PostEO> findAll();



}
