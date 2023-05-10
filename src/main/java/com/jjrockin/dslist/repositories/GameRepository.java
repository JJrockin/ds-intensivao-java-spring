package com.jjrockin.dslist.repositories;

import com.jjrockin.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
