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
	// this function give us the result of a specific round (Tie,Player_A_win or
	// Player_B_win)

	@Override
	public ResultRound getTheRoundWinner(PlayerDescison playerDescisonA, PlayerDescison playerDescisonB) {

		if (playerDescisonA.equals(playerDescisonB))
			return ResultRound.Tie;
		else if ((playerDescisonA.equals(PlayerDescison.Scissors) && playerDescisonB.equals(PlayerDescison.Paper))
				|| (playerDescisonA.equals(PlayerDescison.Rock) && playerDescisonB.equals(PlayerDescison.Scissors))
				|| (playerDescisonA.equals(PlayerDescison.Paper) && playerDescisonB.equals(PlayerDescison.Rock)))
			return ResultRound.Player_A_win;
		else if ((playerDescisonA.equals(PlayerDescison.Paper) && playerDescisonB.equals(PlayerDescison.Scissors))
				|| (playerDescisonA.equals(PlayerDescison.Scissors) && playerDescisonB.equals(PlayerDescison.Rock))
				|| (playerDescisonA.equals(PlayerDescison.Rock) && playerDescisonB.equals(PlayerDescison.Paper)))
			return ResultRound.Player_B_win;
		else
			throw new IllegalArgumentException(
					"playerDescion argument  doesn't mutch with the  predefined  ones (Roc,Paper,Scissors)");
	}

}
