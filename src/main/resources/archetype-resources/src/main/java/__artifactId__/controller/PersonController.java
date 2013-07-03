package ${groupId}.${artifactId}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ${groupId}.${artifactId}.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/person/list", method = RequestMethod.GET)
	public String listPersons(ModelMap model) {
		model.addAttribute("persons", personService.findAll());
		return "listPersons";
	}
}