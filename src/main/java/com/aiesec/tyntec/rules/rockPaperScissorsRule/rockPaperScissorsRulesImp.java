package com.aiesec.tyntec.rules.rockPaperScissorsRule;

import org.springframework.stereotype.Component;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;
import com.aiesec.tyntec.rules.GameRules;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
public class rockPaperScissorsRulesImp implements GameRules {
	// the rules of our game are :
	//  Scissors beats Paper
	//  Rock beat Scissors
	//  Paper beats Rock
	// If both players choose the same, the round is counted as a tie.
	// this function give us the result of a specific round (Tie,Player_A_win or Player_B_win)

	@Override
	public ResultRound getTheRoundWinner(PlayerDescison playerDescisonA, PlayerDescison playerDescisonB) {
		if (playerDescisonA == playerDescisonB)
			return ResultRound.Tie;
		else if ((playerDescisonA == PlayerDescison.Scissors && playerDescisonB == PlayerDescison.Paper)
				|| (playerDescisonA == PlayerDescison.Rock && playerDescisonB == PlayerDescison.Scissors)
				|| (playerDescisonA == PlayerDescison.Paper && playerDescisonB == PlayerDescison.Rock))
			return ResultRound.Player_A_win;
		else
			return ResultRound.Player_B_win;
	}

}
