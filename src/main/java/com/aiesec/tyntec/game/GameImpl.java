package com.aiesec.tyntec.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.players.rockPaperScissors.PlayerA;
import com.aiesec.tyntec.players.rockPaperScissors.PlayerB;
import com.aiesec.tyntec.rockPaperScissorsGame.GameRes;
import com.aiesec.tyntec.round.RoundImpl;

/**
 * @author Ikbel benabdessamad 22/10/2018 ==>Return the final result of the Rock
 *         paper scissors after roundNumber round
 */
@Component
public class GameImpl implements Game {
	// Define all the dependecies of this class
	// Apply the dependecy inversion principle of the STRONG acronym using the
	// spring-boot framework
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

	@Override
	public void retriveGameResult(Integer roundNumber) {

		for (int j = 0; j < roundNumber; j++) {
			gameResult.addRoundResult(roundResult.getRoundWinner(playerA.retrievePlayerDescision(roundNumber),
					playerB.retrievePlayerDescision(roundNumber)));
		}

	}

}
