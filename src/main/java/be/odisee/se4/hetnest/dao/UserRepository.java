package be.odisee.se4.hetnest.dao;

import be.odisee.se4.hetnest.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUsername(String username);
}
