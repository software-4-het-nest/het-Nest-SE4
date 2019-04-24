package be.odisee.se4.hetnest.dao;

import be.odisee.se4.hetnest.domain.Recept;
import org.springframework.data.repository.CrudRepository;

public interface ReceptRepository  extends CrudRepository<Recept, Long> {
}
