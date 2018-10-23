package com.aiesec.tyntec.playStrategies.rockPaperScissorsStrategies;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.aiesec.tyntec.playStrategies.PlayStrategy;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
@Component
@Qualifier("RandomMethod")
public class RandomStartegy implements PlayStrategy {
	private final Random Random = new Random();
	private int answer;

	// Choose randomly a Descision (Rock,Paper or Scissors ) in the defined round

	@Override
	public PlayerDescison retrievePlayerDescision(int round) {

		/**
		 * 'answer' variable may be 1 ,2 or 3 depending on the Random value
		 */

		int value = getRandomFrom1to3();
		switch (value) {
		case 1:
			return PlayerDescison.Rock;
		case 2:
			return PlayerDescison.Paper;
		default:
			return PlayerDescison.Scissors;

		}
	}

	public int getRandomFrom1to3() {
		answer = Random.nextInt(3) + 1;
		return answer;
	}

}
