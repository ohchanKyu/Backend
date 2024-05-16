package com.example.soll.backend.repository;

import com.example.soll.backend.entitiy.SeoulParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeoulParkingLotRepository extends JpaRepository<SeoulParkingLot, Long> {
}
