package guru.springframework.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.entity.Recipe;

/**
* @author ZinBhoneHtut
* @credit guru.springframework
* @date Oct 8, 2021
*/
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
	
}
