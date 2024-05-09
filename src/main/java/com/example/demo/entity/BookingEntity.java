package com.example.demo.entity;

import com.example.demo.models.BookingModel;
import com.example.demo.util.BookingType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String seat;
    //enum
    @Enumerated(EnumType.STRING)
    private BookingType type;
    //relationship
    @ManyToOne
//    @JsonBackReference
    @JoinColumn(name = "user_id")
    private UserEntity user;
    //relationship
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private FlightEntity flight;

    public BookingEntity() {
    }

    public BookingEntity(long id, String seat, BookingType type, UserEntity user, FlightEntity flight) {
        this.id = id;
        this.seat = seat;
        this.type = type;
        this.user = user;
        this.flight = flight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public BookingType getType() {
        return type;
    }

    public void setType(BookingType type) {
        this.type = type;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public FlightEntity getFlight() {
        return flight;
    }

    public void setFlight(FlightEntity flight) {
        this.flight = flight;
    }

    public BookingModel toModel(){
        return new BookingModel(this.id, this.seat, this.type, this.user, this.flight);
    }
}
