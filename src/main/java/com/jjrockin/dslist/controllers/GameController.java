package com.jjrockin.dslist.controllers;

import com.jjrockin.dslist.dto.GameMinDTO;
import com.jjrockin.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
