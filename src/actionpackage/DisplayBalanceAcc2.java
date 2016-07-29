//STRATEGY PATTERN FOR DISPLAYBALANCEACC2

package actionpackage;

import datapackage.DataStore;

public class DisplayBalanceAcc2 extends DisplayBalance {

	// displays current balance
	public void displayBalance(DataStore d) {
		System.out.println("Current balance is " + d.getB());
	}

}
