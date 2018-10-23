package com.aiesec.tyntec;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.aiesec.tyntec.game.GameImpl;
import com.aiesec.tyntec.rockPaperScissorsGame.GameRes;

@Configuration
public class GameConfig {

	/**
	 * Define all class dependencies
	 * 
	 */
	@Autowired
	GameRes gameImp;
	@Autowired
	GameImpl game;

	private static final int RoundNumber = 100;

	/**
	 * @PostConstruct is run just after all the project components initialized
	 * 
	 */
	/**
	 * This method return the final result of the Rock paper scissors game
	 */
	@PostConstruct
	public void displayResult() {

		game.retriveGameResult(RoundNumber);

		System.out.println("\n\nPlayer A wins " + gameImp.getCountWinPlayerA() + " of " + RoundNumber);
		System.out.println("Player B wins " + gameImp.getCountWinPlayerB() + " of " + RoundNumber);
		System.out.println("Tie: " + gameImp.getCountTie() + " of " + RoundNumber + "\n\n");
	}
}
