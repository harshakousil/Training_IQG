package training.iqgateway.springboot.SpringBootOffence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OffenceController {
	
	@Autowired
	private OffenceService offenceServiceRef;
	
	@RequestMapping
	public List<OffenceEO> fectchAllOffences()
	{
		return offenceServiceRef.getAllOffences();
		
	}
	@RequestMapping(value="/add-offences", method=RequestMethod.POST)
	public void addDept(@RequestBody OffenceEO offEO)
	{
		offenceServiceRef.addOffence(offEO);
	}


}
