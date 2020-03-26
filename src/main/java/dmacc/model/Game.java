package dmacc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	public String player1;
	public String computerPlayer;
	public String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	public void setComputerPlayerToRandom() {
		String[] answers = {"rock", "paper", "scissors", "lizard", "spock"};
		int numOfAnswers = answers.length;
		int randAnswerIndex = (int) (Math.random() * numOfAnswers);
		String randAnswer = answers[randAnswerIndex];
		
		this.computerPlayer = randAnswer;
	}
	
	public void determineWinner() {
		String result;
		switch(player1) {
			case "rock": {
				switch(computerPlayer) {
					case "rock": {
						result = "Tied";
						break;
					}
					case "paper":
					case "spock": {
						result = "Computer";
						break;
					}
					default: {
						result = "Player 1";
					}
				}
				break;
			}
			case "paper": {
				switch(computerPlayer) {
					case "paper": {
						result = "Tied";
						break;
					}
					case "scissors":
					case "lizard": {
						result = "Computer";
						break;
					}
					default: {
						result = "Player 1";
					}
				}
				break;
			}
			case "scissors": {
				switch(computerPlayer) {
					case "scissors": {
						result = "Tied";
						break;
					}
					case "rock":
					case "spock": {
						result = "Computer";
						break;
					}
					default: {
						result = "Player 1";
					}
				}
				break;
			}
			case "lizard": {
				switch(computerPlayer) {
					case "lizard": {
						result = "Tied";
						break;
					}
					case "rock":
					case "scissors": {
						result = "Computer";
						break;
					}
					default: {
						result = "Player 1";
					}
				}
				break;
			}
			case "spock": {
				switch(computerPlayer) {
					case "spock": {
						result = "Tied";
						break;
					}
					case "paper":
					case "lizard": {
						result = "Computer";
						break;
					}
					default: {
						result = "Player 1";
					}
				}
				break;
			}
			default: {
				result = "Invalid Entry";
			}
		}
		
		this.winner = result;
	}
}
