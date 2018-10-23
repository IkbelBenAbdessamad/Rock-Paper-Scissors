package com.aiesec.tyntec.game;

import com.aiesec.tyntec.rockPaperScissorsGame.GameRes;

/**
 * @author Ikbel benabdessamad 22/10/2018 
 * Game returns the  final result  after roundNumber round
 */
public interface Game {
	GameRes retriveGameResult(Integer roundNumber);
	
}
