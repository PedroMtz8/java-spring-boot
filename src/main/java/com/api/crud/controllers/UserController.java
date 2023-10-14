package com.api.crud.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService; 

    @GetMapping
    public ArrayList<UserModel> getUsers() {
        return this.userService.getUsers();
    }

   @PostMapping
    public ResponseEntity<Object> saveUser(@RequestBody UserModel user) {
        try {
            UserModel savedUser = this.userService.saveUser(user);
            return ResponseEntity.ok(savedUser); // Devolver UserModel en caso de éxito
        } catch (Exception e) {
            String errorMessage = e.getMessage(); // Obtener el mensaje de error de la excepción

            // Personalizar la respuesta de error con el mensaje de error de MySQL.
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("message", errorMessage);
            errorResponse.put("email", user.getEmail());

        // Devolver un ResponseEntity con el estado HTTP 500 (Error interno del servidor) y el JSON de error
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public Optional<UserModel> updateUserById(@RequestBody UserModel request, Long id) {
        return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if(ok){
            return "User with id " + id + " deleted!"; 
        } else {
            return "Error, user not found";
        }
    }

}
