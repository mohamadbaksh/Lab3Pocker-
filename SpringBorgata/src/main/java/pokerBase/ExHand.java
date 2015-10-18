package pokerBase;

import pokerBase.Hand;

public class ExHand extends Exception 
{
	private Hand winningHand;

	public ExHand(Hand Tie) {

		this.winningHand = Tie;
	}
}