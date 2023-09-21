package training.iqgateway.springbootMongo.springbootmongo;

import java.util.List;

import org.springframework.stereotype.Service;

public interface MongoOffenceService {
	

	public List<OffenceEO> getAllOffences();
	
	public OffenceEO findById(String vehicleNum);
	

}
