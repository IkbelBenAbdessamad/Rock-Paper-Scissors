package com.aiesec.tyntec.rockPaperScissorsGame;

import com.aiesec.tyntec.rockPaperScissorsGame.game_enums.ResultRound;

/**
 * @author Ikbel benabdessamad 22/10/2018
 *
 */
public interface GameRes {

	void addRoundResult(ResultRound resultRound);

	int getCountWinPlayerA();

	int getCountWinPlayerB();

	int getCountTie();
}
