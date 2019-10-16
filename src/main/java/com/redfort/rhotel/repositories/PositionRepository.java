package com.redfort.rhotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redfort.rhotel.entities.Position;
import com.redfort.rhotel.entities.Staff;

public interface PositionRepository extends JpaRepository<Position, Long>{

}
