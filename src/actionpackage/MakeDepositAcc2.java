//STRATEGY PATTERN FOR MAKEDEPOSITACC2

package actionpackage;

import datapackage.DataStore;

public class MakeDepositAcc2 extends MakeDeposit {

	public void makeDeposit(DataStore d) {
		d.incrementBalance(); // for adding amount to the balance account 2
								// version
	}
}
