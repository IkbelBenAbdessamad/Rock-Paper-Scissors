package com.aiesec.tyntec.players.rockPaperScissors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playStrategies.PlayStrategy;
import com.aiesec.tyntec.players.Player;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("PlayerB")
public class PlayerB implements Player {

	/*
	 * Define PlayerB dependencies
	 */
	@Autowired
	@Qualifier("RandomMethod")
	PlayStrategy playMetod;

	/*
	 * Return PlayerA descison according to the Random strategy within a specific round
	 */
	@Override
	public PlayerDescison retrievePlayerDescision(int round) {
		return playMetod.retrievePlayerDescision(round);
	}

}
