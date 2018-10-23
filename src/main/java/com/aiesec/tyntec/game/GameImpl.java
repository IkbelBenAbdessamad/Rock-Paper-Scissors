package com.aiesec.tyntec.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.players.rockPaperScissors.PlayerA;
import com.aiesec.tyntec.players.rockPaperScissors.PlayerB;
import com.aiesec.tyntec.rockPaperScissorsGame.GameRes;
import com.aiesec.tyntec.round.RoundImpl;

/**
 * @author Ikbel benabdessamad 22/10/2018
 * 
 * 
 */
@Component
public class GameImpl implements Game {

	/**
	 * Define all class dependencies
	 * 
	 */

	@Autowired
	@Qualifier("PlayerA")
	PlayerA playerA;

	@Autowired
	@Qualifier("PlayerB")
	PlayerB playerB;

	@Autowired
	RoundImpl roundResult;
	@Autowired
	GameRes gameResult;

	/**
	 * Get the final result of the game after roundNumber round
	 */
	@Override
	public GameRes retriveGameResult(Integer roundNumber) {

		for (int j = 0; j < roundNumber; j++) {
			gameResult.addRoundResult(roundResult.getRoundWinner(playerA.retrievePlayerDescision(roundNumber),
					playerB.retrievePlayerDescision(roundNumber)));
		}

		return gameResult;
	}

}
