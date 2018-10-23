package com.aiesec.tyntec.players.rockPaperScissors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playMethod.PlayMethod;
import com.aiesec.tyntec.players.Player;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("PlayerA")
public class PlayerA implements Player {
	@Autowired
	@Qualifier("PaperMethod")
	PlayMethod playMethod;

	@Override
	public PlayerDescison retrievePlayerDescision(int round) {
		return playMethod.retrievePlayerDescision(round);
	}

}
