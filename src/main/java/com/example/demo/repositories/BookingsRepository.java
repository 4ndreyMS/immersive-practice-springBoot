package com.example.demo.repositories;

import com.example.demo.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingsRepository extends JpaRepository<BookingEntity, Long> {
}
