package be.odisee.se4.hetnest.dao;

import be.odisee.se4.hetnest.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
