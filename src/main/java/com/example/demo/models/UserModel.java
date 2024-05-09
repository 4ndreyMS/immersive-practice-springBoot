package com.example.demo.models;

import com.example.demo.entity.BookingEntity;
import com.example.demo.entity.FlightEntity;
import com.example.demo.entity.UserEntity;
import jakarta.persistence.*;

import java.util.List;


public class UserModel {
    private long id;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    // relationship
    private List<BookingEntity> bookings;

    public UserModel(long id, String userName, String email, String password, String firstName, String lastName) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserModel(long id, String userName, String email, String password, String firstName, String lastName, List<BookingEntity> bookings) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookings = bookings;
    }

    public UserModel(UserEntity userEntity){
        this.id = userEntity.getId();
        this.userName = userEntity.getUserName();
        this.email = userEntity.getEmail();
        this.password = userEntity.getPassword();
        this.firstName = userEntity.getFirstName();
        this.lastName = userEntity.getLastName();
    }



    public UserModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<BookingEntity> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingEntity> bookings) {
        this.bookings = bookings;
    }

    public UserEntity toUserEntity() {
        return new UserEntity(this.id, this.userName, this.email, this.password, this.firstName, this.lastName, this.bookings);
    }
}
