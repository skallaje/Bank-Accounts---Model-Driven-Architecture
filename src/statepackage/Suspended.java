//DECENTRALIZED STATE PATTERN FOR SUSPENDED

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Suspended extends EFSM_States {

	public Suspended(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void close() {
		m.change_state(9); // goes to closed state
		op.close(); // closes the account
	}

	public void balance() {
		op.displayBalance(); // displays current balance
	}

	public void activate() {
		m.change_state(3); // activates suspended account 2 by taking it back to
							// ready state
	}
}