//STRATEGY PATTERN FOR STORECREDENTIALSACC1

package actionpackage;

import datapackage.DataStore;

public class StoreCredentialsAcc1 extends StoreCredentials {

	public void storeCredentials(DataStore d) {
		d.setBalance(d.getTemp_a()); // sets balance with temp balance
		d.setPin(d.getTemp_p()); // sets pin with temp pin
		d.setId(d.getTemp_y()); // sets id with temp id
	}
}