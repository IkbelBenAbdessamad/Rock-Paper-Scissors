package com.aiesec.tyntec.round;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
public interface Round {

	ResultRound getRoundWinner(PlayerDescison playerDescisonA, PlayerDescison descisonB);
}
