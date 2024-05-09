//package com.example.demo.controllers;
//
//
//import com.example.demo.models.UserModel;
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class HelloWorlController {
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping("/")
//    public String hello()
//    {
//        return "<h1>Hello World</h1>";
//    }
//
//    @GetMapping("/getAll")
//    public ResponseEntity getAll() {
//        return new ResponseEntity(userService.getUserList(), HttpStatus.OK);
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity create(@RequestBody UserModel user) {
//        userService.createUser(user);
//        return new ResponseEntity(user, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{userId}")
//    public ResponseEntity delete(@PathVariable long userId) {
//        return new ResponseEntity<>(userService.delete(userId), HttpStatus.OK);
//    }
//
//    @GetMapping("/getById/{userId}")
//    public ResponseEntity getUserById(@PathVariable long userId) {
//        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);
//    }
//
//    @PutMapping("/update")
//    public ResponseEntity updateUser(@RequestBody UserModel user) {
//        return new ResponseEntity(userService.update(user), HttpStatus.OK);
//    }
//
//
//
//}
