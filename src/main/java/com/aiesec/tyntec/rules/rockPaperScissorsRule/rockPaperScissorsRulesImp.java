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

	/**
	 * Return the Result of a specific round according to PlayerA and PlayerB descisons 
	 */
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
					"playerDescion argument  doesn't match with the  predefined  ones (Rock,Paper,Scissors)");
	}

}
