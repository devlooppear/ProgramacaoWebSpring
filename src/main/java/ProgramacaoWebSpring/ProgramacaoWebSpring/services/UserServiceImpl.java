package ProgramacaoWebSpring.ProgramacaoWebSpring.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ProgramacaoWebSpring.ProgramacaoWebSpring.entities.UserEntity;
import ProgramacaoWebSpring.ProgramacaoWebSpring.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAll() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            logger.error("An error occurred while fetching all users: {}", e.getMessage());
            throw e;
        }
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        try {
            return userRepository.findById(id);
        } catch (Exception e) {
            logger.error("An error occurred while fetching user by id {}: {}", id, e.getMessage());
            throw e;
        }
    }

    @Override
    public UserEntity save(UserEntity user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            logger.error("An error occurred while saving user {}: {}", user, e.getMessage());
            throw e;
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("An error occurred while deleting user by id {}: {}", id, e.getMessage());
            throw e;
        }
    }
}
