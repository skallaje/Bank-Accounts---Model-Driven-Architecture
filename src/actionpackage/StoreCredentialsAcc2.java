//STRATEGY PATTERN FOR STORECREDENTIALSACC2

package actionpackage;

import datapackage.DataStore;

public class StoreCredentialsAcc2 extends StoreCredentials {

	public void storeCredentials(DataStore d) {
		d.setB(d.getTemp_b()); // sets balance for account 2 with temp balance
		d.setKey(d.getTemp_key()); // sets pin for account 2 with temp pin
		d.setAid(d.getTemp_aid()); // sets id for account 2 with temp id
	}

}
