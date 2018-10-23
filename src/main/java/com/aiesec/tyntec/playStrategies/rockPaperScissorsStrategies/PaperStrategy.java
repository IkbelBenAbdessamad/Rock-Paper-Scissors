package com.aiesec.tyntec.playStrategies.rockPaperScissorsStrategies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playStrategies.PlayStrategy;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("PaperMethod")
public class PaperStrategy implements PlayStrategy {
	// This class always return Paper according

	@Override
	public PlayerDescison retrievePlayerDescision(int round) {
		return PlayerDescison.Paper;
	}

}
