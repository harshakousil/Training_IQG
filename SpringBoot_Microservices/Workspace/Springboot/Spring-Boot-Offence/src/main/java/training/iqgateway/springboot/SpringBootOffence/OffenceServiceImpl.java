package training.iqgateway.springboot.SpringBootOffence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffenceServiceImpl implements OffenceService {

	
	@Autowired
	private OffenceRepository OffenceRepRef;
	
	@Override
	public List<OffenceEO> getAllOffences() {
		
		List<OffenceEO> offenceList =new ArrayList<>();
		OffenceRepRef.findAll().forEach(offenceList::add);
		return offenceList;

	}

	@Override
	public void addOffence(OffenceEO deptEO) {
		
		OffenceRepRef.save(deptEO);
	}

}
