package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users") /// qual caminho responde
public class UserController {

    /// esse metodo findAll vai ter que ir no banco de dados e retornar todos os usuarios
    /// quem acessa o banco de dados e o userRepository

@Autowired /// para nao instaciar o objeto injeção de dependencias
    private UserRepository repository;
    // para acessar o userRepository

    @GetMapping // qual o verbo http que esta configurado.
    public List<User> RetornaVariosUsuarios(){
        List<User> resposta =  repository.findAll();
        /// findAll vai la no banco e pega a chamada
        return  resposta;
    }

    @GetMapping(value = "/{id}") // qual o verbo http que esta configurado.
    public User RetornaUmUsuario(@PathVariable Long id){
           User  resposta =  repository.findById(id).get();
        /// findAll vai la no banco e pega a chamada
        return  resposta;
    }


        @PostMapping("")
        public User createUser(@RequestBody User user) {
            User result = repository.save(user);
            return result;
        }


}
