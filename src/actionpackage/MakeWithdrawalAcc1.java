//STRATEGY PATTERN FOR MAKEWITHDRAWALACC1

package actionpackage;

import datapackage.DataStore;

public class MakeWithdrawalAcc1 extends MakeWithdrawal {

	public void makeWithdrawal(DataStore d) {
		d.decrementBalance(); // for deducting amount from the balance account 1
								// version
	}

}
