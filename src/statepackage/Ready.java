//DECENTRALIZED STATE PATTERN FOR READY

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Ready extends EFSM_States {

	public Ready(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void withdraw() {
		op.makeWithdrawal(); // makes withdraw
		m.change_state(4); // goes to min balance state
	}

	public void forbidWithdraw() {
		op.displayBelowMinBalMsg(); // displays below min balance msg
	}

	public void balance() {
		op.displayBalance(); // displays current balance
	}

	public void incorrectLock() {
		op.incorrectPinMsg(); // displays incorrect pin msg
	}

	public void correctLock() {
		m.change_state(7); // goes to locked state
	}

	public void deposit() {
		op.makeDeposit(); // calls deposit()
	}

	public void suspend() {
		m.change_state(8); // goes to suspended state
	}

	public void logout() {
		m.change_state(1); // goes to idle state
	}
}