//DECENTRALIZED STATE PATTERN FOR OVERDRAWN

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Overdrawn extends EFSM_States {

	public Overdrawn(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void withdraw() {
		op.displayBelowMinBalMsg(); // displays below min balance msg
	}

	public void balance() {
		op.displayBalance(); // displays current balance
	}

	public void incorrectLock() {
		op.incorrectPinMsg(); // displays incorrect pin msg
	}

	public void deposit() {
		m.change_state(4); // goes to min balance state
		op.makeDeposit(); // makes a deposit
	}

	public void logout() {
		m.change_state(1); // goes to idle state
	}

	public void correctLock() {
		m.change_state(7); // goes to locked state
	}
}