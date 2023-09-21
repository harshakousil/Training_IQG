package training.iqgateway.springbootMongo.springbootmongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MongoOffenceRepository extends MongoRepository<OffenceEO, Integer> {

	public OffenceEO findById(String vehicleNum);
}
