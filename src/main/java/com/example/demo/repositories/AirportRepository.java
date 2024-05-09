package com.example.demo.repositories;

import com.example.demo.entity.AirportEntity;
import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<AirportEntity, Long> {

}
