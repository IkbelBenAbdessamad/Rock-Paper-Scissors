package com.aiesec.tyntec.rules;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
public interface GameRules {

	/**
	 * 
	 * @return the round winner according to the descison of the two player
	 */
	ResultRound getTheRoundWinner(PlayerDescison playerDescisonA, PlayerDescison playerDescisonB);

}
