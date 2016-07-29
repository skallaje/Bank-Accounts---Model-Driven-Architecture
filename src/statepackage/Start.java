//DECENTRALIZED STATE PATTERN FOR START

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Start extends EFSM_States {

	public Start(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void open() {
		op.storeCredentials(); // calls account specific store credentials
								// method
		m.change_state(1); // goes to idle state
	}
}