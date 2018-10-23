package com.aiesec.tyntec.playMethod.rockPaperScissors;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playMethod.PlayMethod;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("PaperMethod")
public class PaperMethod implements PlayMethod {
	// This class always return Paper according

	@Override
	public PlayerDescison retrievePlayerDescision(int round) {
		return PlayerDescison.Paper;
	}

}
