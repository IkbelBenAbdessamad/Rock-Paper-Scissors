package com.aiesec.tyntec;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.aiesec.tyntec.game.GameImpl;
import com.aiesec.tyntec.rockPaperScissorsGame.GameRes;

/**
 * @author ikbel benabdessamad 22/10/2018
 *
 */
@SpringBootApplication
@ComponentScan("com.aiesec.tyntec")
public class TyntecTestApplication {
	//Apply the depenedecy inversion principle using  spring-boot  annotations
	@Autowired
	GameRes gameImp;
	@Autowired
	GameImpl game;
	
	//Declare RoundNumber as variable in order to hande  multiple uses cases  ( the round number can change)
	private static final int RoundNumber = 100;

	public static void main(String[] args) {
		SpringApplication.run(TyntecTestApplication.class, args);
	}

	@PostConstruct
	public void displayResult() {
		game.retriveGameResult(RoundNumber);
		
		System.out.println("\n\nPlayer A wins " + gameImp.getCountWinPlayerA() + " of " + RoundNumber);
		System.out.println("Player B wins " + gameImp.getCountWinPlayerB() + " of " + RoundNumber);
		System.out.println("Tie: " + gameImp.getCountTie() + " of " + RoundNumber+ "\n\n");

	}
}
