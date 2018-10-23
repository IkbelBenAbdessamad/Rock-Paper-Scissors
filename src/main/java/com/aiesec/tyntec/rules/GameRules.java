package com.aiesec.tyntec.rules;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
public interface GameRules {

	// Return the winner in this  specific  round according  to the two players  descison 

	ResultRound getTheRoundWinner(PlayerDescison playerDescisonA, PlayerDescison playerDescisonB);

}
