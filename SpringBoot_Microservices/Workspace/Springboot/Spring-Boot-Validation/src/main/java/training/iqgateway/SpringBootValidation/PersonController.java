package training.iqgateway.SpringBootValidation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@Autowired
	private PersonRepository personRepoRef;
	
	@RequestMapping("/signup")
	public String showSignupForm(Person person) {
		return "add-person";
	}
	
	@PostMapping("/addperson")
	public String addPerson(@Valid Person person, BindingResult result, Model model) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "add-person";
		}
		
		personRepoRef.save(person);
		System.out.println("Person Saved ... ");
		return "redirect:/index";
	}
	
	// Additional CRUD Operations
	
	@GetMapping("/index")
	public String showPersonList(Model model) {
		model.addAttribute("persons", personRepoRef.findAll());
		return "index";
	}
	
	
	@GetMapping("/edit/{id}")
	public String showUpdateForm(@PathVariable("id")String id, Model model) {
		Person person = personRepoRef.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Invalid Id: " + id));
		
		model.addAttribute("person", person);
		return "update-person";
	}
	
	@PostMapping("/update/{id}")
	public String updatePerson(@PathVariable("id")String id, 
					@Valid Person person, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			person.setId(id);
			return "update-person";
		}
		
		personRepoRef.save(person);
		return "redirect:/index";
	}
	
	@GetMapping("/delete/{id}")
	public String deletePerson(@PathVariable("id")String id, Model model) {
		Person person = personRepoRef.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Invalid Id: " + id));
		
		personRepoRef.delete(person);
		return "redirect:/index";
	}
		
}
