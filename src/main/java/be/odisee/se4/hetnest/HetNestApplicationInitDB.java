package be.odisee.se4.hetnest;

import be.odisee.se4.hetnest.dao.*;
import be.odisee.se4.hetnest.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


@Component
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
public class HetNestApplicationInitDB implements CommandLineRunner {

    @Autowired
    AanbiederRepository aanbiederRepository;

    @Autowired
    AanbiedingRepository aanbiedingRepository;

    @Autowired
    BrouwEntryRepository brouwEntryRepository;

    @Autowired
    BrouwLogSnapshotRepository brouwLogSnapshotRepository;

    @Autowired
    BrouwselIngredientRepository brouwselIngredientRepository;

    @Autowired
    BrouwselRepository brouwselRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    LeveringRepository leveringRepository;

    @Autowired
    ReceptRepository receptRepository;

    @Autowired
    VoorraadRepository voorraadRepository;

    @Autowired
    UserRepository  userRepository;

    @Override
    public void run(String... args) throws Exception {

        List<User> users = Arrays.asList(
                new User(1, "tibovds", "test", "Tibo", "Van De Sijpe", "Administrator")
        );


        for (User user: users) {
            // user must be saved for it to have an id
            userRepository.save(user);
        }
    }
}
