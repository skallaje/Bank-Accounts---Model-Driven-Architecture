//STRATEGY PATTERN FOR DISPLAYBALANCEACC1

package actionpackage;

import datapackage.DataStore;

public class DisplayBalanceAcc1 extends DisplayBalance {

	// displays current balance
	public void displayBalance(DataStore d) {
		System.out.println("Current balance is " + d.getBalance());
	}

}
