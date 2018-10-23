package com.aiesec.tyntec.players;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
public interface Player {
	// Get the palyer descision according to its strategie within a specific round
	PlayerDescison retrievePlayerDescision(int  round);

}
