package com.aiesec.tyntec.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.PlayerDescison;
import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;
import com.aiesec.tyntec.rules.rockPaperScissorsRule.rockPaperScissorsRulesImp;

/**
 * @author Ikbel benabdessamad 23/10/2018 2:00 AM
 *
 */
public class RulesTest {

	@Test
	public void test() {
		// Testing the 3 rules of the rock paper scissor game
		rockPaperScissorsRulesImp rules = new rockPaperScissorsRulesImp();
		// Testing the Tie Result
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Paper, PlayerDescison.Paper), ResultRound.Tie);
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Scissors, PlayerDescison.Scissors), ResultRound.Tie);
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Rock, PlayerDescison.Rock), ResultRound.Tie);

		// Testing the Player_A_win Result
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Paper, PlayerDescison.Rock), ResultRound.Player_A_win);
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Scissors, PlayerDescison.Paper), ResultRound.Player_A_win);
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Rock, PlayerDescison.Scissors), ResultRound.Player_A_win);

		// Testing the Player_B_win Result
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Rock, PlayerDescison.Paper), ResultRound.Player_B_win);
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Paper, PlayerDescison.Scissors), ResultRound.Player_B_win);
		assertEquals(rules.getTheRoundWinner(PlayerDescison.Scissors, PlayerDescison.Rock), ResultRound.Player_B_win);
	}

}
