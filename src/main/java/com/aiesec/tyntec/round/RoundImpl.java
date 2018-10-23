package com.aiesec.tyntec.round;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;
import com.aiesec.tyntec.rules.GameRules;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
public class RoundImpl implements Round {

	// Using the Inversion dependecy of the SOLID acronym
	@Autowired
	GameRules gameRule;

	@Override
	public ResultRound getRoundWinner(PlayerDescison playerDescisonA, PlayerDescison playerDescisonB) {
		return gameRule.getTheRoundWinner(playerDescisonA, playerDescisonB);
	}

}
