package training.iqgateway.springbootMongo.springbootmongo;

import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class MongoOffenceEOController {

	
	@Autowired
	private MongoOffenceRepository ref;
	
	
	@GetMapping("/index")
	public String showPersonList(Model model) {
		
		List<OffenceEO> offenceList = ref.findAll();
		for (Iterator iterator = offenceList.iterator(); iterator.hasNext();) {
			OffenceEO offenceEO = (OffenceEO) iterator.next();
			System.out.println(offenceEO);
		}
		//model.addAttribute("offences",offenceList);
		return "index";
	}
	



}
