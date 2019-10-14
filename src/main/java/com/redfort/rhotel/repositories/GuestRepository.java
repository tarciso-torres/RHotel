package com.redfort.rhotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfort.rhotel.entities.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
