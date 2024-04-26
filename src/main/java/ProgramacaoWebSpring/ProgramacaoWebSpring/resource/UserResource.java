package ProgramacaoWebSpring.ProgramacaoWebSpring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ProgramacaoWebSpring.ProgramacaoWebSpring.entities.UserEntity;
import ProgramacaoWebSpring.ProgramacaoWebSpring.services.UserService;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "/api/users")
public class UserResource {

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.save(user); 
    }

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.findAll(); 
    }

    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userService.findById(id) 
                .orElseThrow(() -> new NoSuchElementException("User not found with id: " + id));
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity user) {
        return userService.save(user); 
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id); 
    }
}
