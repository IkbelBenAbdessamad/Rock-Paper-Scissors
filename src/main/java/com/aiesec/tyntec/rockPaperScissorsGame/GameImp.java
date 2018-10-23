package com.aiesec.tyntec.rockPaperScissorsGame;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
/**
 * On each round we will store the round result into a static variable
 * (numberWinPlayerA,numberWinPlayerB or numberTie) In fact after the end of all
 * the round we'll obtain the result of all game
 **/

@Component
public class GameImp implements GameRes {

	private AtomicInteger countWinPlayerA = new AtomicInteger(0);
	private AtomicInteger countWinPlayerB = new AtomicInteger(0);
	private AtomicInteger countTie = new AtomicInteger(0);
    
	@Override
	public void addRoundResult(ResultRound ResultRound) {
		if (ResultRound == ResultRound.Tie) {
			countTie.incrementAndGet();
		} else if (ResultRound == ResultRound.Player_A_win) {
			countWinPlayerA.incrementAndGet();
		} else {
			countWinPlayerB.incrementAndGet();
		}
	}

	@Override
	public int getCountWinPlayerA() {
		return countWinPlayerA.get();
	}

	@Override
	public int getCountWinPlayerB() {
		return countWinPlayerB.get();
	}

	@Override
	public int getCountTie() {
		return countTie.get();
	}

}
