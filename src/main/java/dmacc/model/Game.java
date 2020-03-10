package dmacc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game(String player1) {
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	private void determineWinner() {
		// TODO Auto-generated method stub
		String winner = "Kelli";
		// Did you really think I was going to put the implementation for this method on
		// my Github after I told you to implement it?
		this.setWinner(winner);
	}

	private void setComputerPlayer() {
		// TODO Auto-generated method stub
		// Really? Don't be lazy. You can figure it out. Use your brain!
		this.setComputerPlayer("Kelli");

	}
}
