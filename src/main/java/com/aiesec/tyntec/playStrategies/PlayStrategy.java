package com.aiesec.tyntec.playStrategies;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
public interface PlayStrategy {

	PlayerDescison retrievePlayerDescision(int round);
}
