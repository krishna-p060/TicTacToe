package org.example.controllers;

import org.example.models.Game;
import org.example.models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {

        //if 2 player have same symbol then throw exception

        return new Game(dimension, players);
    }

}
