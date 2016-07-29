//STRATEGY PATTERN FOR MAKEDEPOSITACC1

package actionpackage;

import datapackage.DataStore;

public class MakeDepositAcc1 extends MakeDeposit {

	public void makeDeposit(DataStore d) {
		d.incrementBalance(); // for adding amount to the balance account 1
								// version
	}
}
