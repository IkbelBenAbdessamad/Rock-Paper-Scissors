package com.aiesec.tyntec.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.aiesec.tyntec.playStrategies.rockPaperScissorsStrategies.PaperStrategy;
import com.aiesec.tyntec.playStrategies.rockPaperScissorsStrategies.RandomStartegy;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;

/**
 * @author Ikbel benabdessamad 23/10/2018
 */
public class StrategiesTest {

	@Test
	public void test() {
		// Testing Rock paper scissors 2 strategies [paper startegy , random strategy ]

		/**
		 * Testing paper startegy
		 **/
		PaperStrategy paperStartegy = new PaperStrategy();
		assertEquals(paperStartegy.retrievePlayerDescision(0), PlayerDescison.Paper);

		/**
		 * Testing the Random startegy
		 **/

		/**
		 * Testing the getRandomFrom1to3() method of the Random Strategy
		 **/

		RandomStartegy randomStartegy = new RandomStartegy();
		int randomValue = randomStartegy.getRandomFrom1to3();
		assertTrue(randomValue == 1 || randomValue == 2 || randomValue == 3);

		/**
		 * Testing the retrievePlayerDescision() method of the Random Strategy
		 **/
		assertTrue(randomStartegy.retrievePlayerDescision(80).equals(PlayerDescison.Rock)
				|| randomStartegy.retrievePlayerDescision(60).equals(PlayerDescison.Paper)
				|| randomStartegy.retrievePlayerDescision(50).equals(PlayerDescison.Scissors));

	}

}
