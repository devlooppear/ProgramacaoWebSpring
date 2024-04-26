package ProgramacaoWebSpring.ProgramacaoWebSpring.services;

import ProgramacaoWebSpring.ProgramacaoWebSpring.entities.UserEntity;
import java.util.Optional;
import java.util.List;

public interface UserService {
    List<UserEntity> findAll();
    Optional<UserEntity> findById(Long id);
    UserEntity save(UserEntity user); 
    void deleteById(Long id);
}
