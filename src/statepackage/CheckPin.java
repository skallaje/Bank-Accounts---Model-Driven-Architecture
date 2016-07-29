//DECENTRALIZED STATE PATTERN FOR CHECKPIN

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class CheckPin extends EFSM_States {

	public CheckPin(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void incorrectPin(int max) {
		if (m.attempts == max) {
			op.tooManyAttemptsMsg();// displays msg for max invalid attempts
			m.change_state(1); // goes back to Idle state
		} else {
			op.incorrectPinMsg(); // just displays incorrect pin msg
		}
	}

	public void correctPinAboveMin() {
		op.displayMenu(); // displays menu
		m.change_state(3); // goes to ready state
	}

	public void correctPinBelowMin() {
		op.displayMenu(); // displays menu
		m.change_state(6); // goes to overdrawn state
	}

	public void logout() {
		m.change_state(1); // goes to idle state
	}
}