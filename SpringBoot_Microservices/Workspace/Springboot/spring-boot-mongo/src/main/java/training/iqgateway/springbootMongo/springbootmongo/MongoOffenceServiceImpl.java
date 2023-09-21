package training.iqgateway.springbootMongo.springbootmongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MongoOffenceServiceImpl implements MongoOffenceService {

	
	

	@Autowired
	private MongoOffenceRepository OffenceRepoRef;
	
	@Override
	public List<OffenceEO> getAllOffences() {
		List<OffenceEO> offenceList =new ArrayList<>();
		OffenceRepoRef.findAll().forEach(offenceList::add);
		return offenceList;

	}

	@Override
	public OffenceEO findById(String vehicleNum) {
		// TODO Auto-generated method stub
		return null;
	}



}
