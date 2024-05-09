package com.example.demo.models;

import com.example.demo.entity.AirportEntity;

import java.util.List;

public class AirportModel {
    private long id;
    private String city;
    private String country;
    private String location;
    private List<String> gates;

    public AirportModel(long id, String city, String country, String location, List<String> gates) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.location = location;
        this.gates = gates;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getGates() {
        return gates;
    }

    public void setGates(List<String> gates) {
        this.gates = gates;
    }
    public AirportEntity toEntity(){
        return new AirportEntity(this.id, this.city, this.country, this.location, this.gates);
    }
}