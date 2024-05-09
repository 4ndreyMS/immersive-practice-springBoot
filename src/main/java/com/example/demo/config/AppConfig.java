package com.example.demo.config;

import com.example.demo.service.AirPortService;
import com.example.demo.service.BookingService;
import com.example.demo.service.FlightService;
import com.example.demo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public AirPortService airPortService() {
        return new AirPortService();
    }

    @Bean
    public FlightService flightService() {
        return new FlightService();
    }

    @Bean
    public BookingService bookingService() {
        return new BookingService();
    }
}
