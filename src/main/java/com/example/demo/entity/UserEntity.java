package com.example.demo.entity;

import com.example.demo.models.UserModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    //relationship
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<BookingEntity> bookings;


    public UserEntity(UserModel userModel) {
        this.id = userModel.getId();
        this.userName = userModel.getUserName();
        this.email = userModel.getEmail();
        this.password = userModel.getPassword();
        this.firstName = userModel.getFirstName();
        this.lastName = userModel.getLastName();
    }


    public UserEntity(long id, String userName, String email, String password, String firstName, String lastName, List<BookingEntity> bookings) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookings = bookings;
    }

    public UserEntity() {

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

    public UserModel toUserModel() {
        return new UserModel(this.id, this.userName, this.email, this.password, this.firstName, this.lastName, this.bookings);
    }

}


