package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.models.UserModel;
import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;



    public UserService() {
    }

    public UserModel createUser(UserModel newUser) {
        if (getUserById(newUser.getId()) == null){
            userRepository.save(newUser.toUserEntity());
        }

        return null;
    }

    public List<UserModel> getAll(){
        //request to the db
        List<UserEntity> list = userRepository.findAll();
        //translate entity to dto
        List<UserModel> userList = new ArrayList<>();
        for(UserEntity user : list){
            userList.add(user.toUserModel());
        }

        return userList;
    }

    public boolean delete(long userId) {
        userRepository.deleteById(userId);
        return true;
    }


    public UserModel getUserById(long userId) {
        return userRepository.findById(userId).toUserModel();
    }

    public UserModel update(UserModel userToModify) {
        if (getUserById(userToModify.getId()) != null){
            return userRepository.save(userToModify.toUserEntity()).toUserModel();
        }
        return null;
    }


}

