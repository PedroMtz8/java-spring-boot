package com.api.crud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;
import com.api.crud.repositories.IUserRepository;

@Service
public class UserService {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    public UserModel saveUser(UserModel user) {
        UserModel existingUser = userRepository.findUserByEmail(user.getEmail());
        if (existingUser != null) {
            throw new RuntimeException("El usuario con el correo electrónico ya existe"); // Lanza una excepción con el mensaje personalizado
        }

        return userRepository.save(user);
    }

    public Optional<UserModel> getById(String id) {
        return userRepository.findById(id);
    }

    public Optional<UserModel> updateById(UserModel request, String id) {
        Optional<UserModel> user = userRepository.findById(id);
        user.get().setFirstName(request.getFirstName());
        user.get().setLastName(request.getLastName());
        user.get().setEmail(request.getEmail());

        return user;
    }

    /* public UserModel updateByID(UserModel request, Long id ){
        UserModel userModel = userRepository.findById(id).get();
        userModel.setFirstName(request.getFirstName());
        userModel.setLastName(request.getLastName());
        userModel.setEmail(request.getEmail());
        userRepository.save(userModel);
        return userModel;
        } */

    public Boolean deleteUser (String id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}
