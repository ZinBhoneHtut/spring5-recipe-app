package guru.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.repository.RecipeRepository;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 12, 2021
*/
@Controller
public class IndexController {
	
	private final RecipeRepository recipeRepository;
	
	public IndexController(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@GetMapping({"", "/", "/index"})
	public String index(Model model) {
		model.addAttribute("recipes", recipeRepository.findAll());
		return "index";
	}
}

