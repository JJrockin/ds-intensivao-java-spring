package com.jjrockin.dslist.dto;

import com.jjrockin.dslist.entities.GameList;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
