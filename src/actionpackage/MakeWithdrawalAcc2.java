//STRATEGY PATTERN FOR MAKEWITHDRAWALACC2

package actionpackage;

import datapackage.DataStore;

public class MakeWithdrawalAcc2 extends MakeWithdrawal {

	public void makeWithdrawal(DataStore d) {
		d.decrementBalance(); // for deducting amount from the balance account 2
								// version
	}
}
