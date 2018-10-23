package com.aiesec.tyntec.playMethod.rockPaperScissors;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playMethod.PlayMethod;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("RandomMethod")
public class RandomMethod implements PlayMethod {
	private final Random Random = new Random();
	private int answer;

	// Choose randomly a Descision (Rock,Paper or Scissors ) in the defined round

	@Override
	public PlayerDescison retrievePlayerDescision(int round) {

		return retrievePlayerDesc();
	}

	public PlayerDescison retrievePlayerDesc() {
		/**
		 * 'answer' variable may be 1 ,2 or 3 depending on the Random value
		 */
		answer = Random.nextInt(3) + 1;
		switch (answer) {
		case 1:
			return PlayerDescison.Rock;
		case 2:
			return PlayerDescison.Paper;
		default:
			return PlayerDescison.Scissors;

		}

	}

}
