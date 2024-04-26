package ProgramacaoWebSpring.ProgramacaoWebSpring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ProgramacaoWebSpring.ProgramacaoWebSpring.entities.UserEntity;
import ProgramacaoWebSpring.ProgramacaoWebSpring.repositories.UserRepository;

import java.util.Arrays;

@Component
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        UserEntity u1 = new UserEntity(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        UserEntity u2 = new UserEntity(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
