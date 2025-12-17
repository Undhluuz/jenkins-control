package main.java.org.douggschwind.games.boardgames.monopoly.space;

import main.java.org.douggschwind.games.boardgames.monopoly.Monopoly;
import main.java.org.douggschwind.games.boardgames.monopoly.Player;

/**
 * Represents a Chance space on the Monopoly board.
 * @author Doug Gschwind
 */
public class ChanceSpace extends PublicBoardSpace {

	public ChanceSpace() {
		super("Chance");
	}

	@Override
	public final void takeAction(Monopoly gameInProgress, Player player, int playerDiceRollTotal) {
		gameInProgress.playerLandedOnChanceSpace(player, playerDiceRollTotal);
	}
}