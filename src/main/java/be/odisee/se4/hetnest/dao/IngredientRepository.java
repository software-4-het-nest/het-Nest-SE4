package be.odisee.se4.hetnest.dao;

import be.odisee.se4.hetnest.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository  extends CrudRepository<Ingredient, Long> {
}
