package com.p6;

import java.util.Scanner;

public class CricketRating {
	
	
	    private String playerName;
	    private float avgRating;
	    private String Coins;

	    public CricketRating(String playerName, float critic1, float critic2) {
	        this.playerName = playerName;
	        calculateAverageRating(critic1, critic2);
	        this.Coins = calculateCoins();
	    }

	    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
	        this.playerName = playerName;
	        calculateAverageRating(critic1, critic2, critic3);
	        this.Coins = calculateCoins();
	    }

	    public void calculateAverageRating(float critic1, float critic2) {
	        this.avgRating = (critic1 + critic2) / 2;
	    }

	    public void calculateAverageRating(float critic1, float critic2, float critic3) {
	        this.avgRating = (critic1 + critic2 + critic3) / 3;
	    }

	    public String calculateCoins() {
	        if (avgRating >= 7) {
	            return "Gold";
	        } else if (avgRating >= 5) {
	            return "Silver";
	        } else if (avgRating >= 2) {
	            return "Copper";
	        } else {
	            return "NotEligible";
	        }
	    }

	    public void display() {
	        System.out.println(playerName + " " + avgRating + " " + Coins);
	    }
	
@SuppressWarnings("serial")
class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}
	

	
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				// Input for player with two critics
				System.out.println("Enter player name, critic1, critic2:");
				String playerName = scanner.next();
				float critic1 = scanner.nextFloat();
				float critic2 = scanner.nextFloat();
				CricketRating player1 = new CricketRating(playerName, critic1, critic2);
				player1.display();

				// Input for player with three critics
				System.out.println("Enter player name, critic1, critic2, critic3:");
				playerName = scanner.next();
				critic1 = scanner.nextFloat();
				critic2 = scanner.nextFloat();
				float critic3 = scanner.nextFloat();
				CricketRating player2 = new CricketRating(playerName, critic1, critic2, critic3);
				player2.display();
			}

	        
	    
	}

}