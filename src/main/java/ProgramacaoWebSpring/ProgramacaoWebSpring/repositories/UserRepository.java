package ProgramacaoWebSpring.ProgramacaoWebSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProgramacaoWebSpring.ProgramacaoWebSpring.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
}