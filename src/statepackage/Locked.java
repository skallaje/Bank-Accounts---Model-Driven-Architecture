//DECENTRALIZED STATE PATTERN FOR LOCKED

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Locked extends EFSM_States {

	public Locked(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void incorrectUnlock() {
		op.incorrectPinMsg(); // displays incorrect pin msg
	}

	public void correctUnlock() {
		m.change_state(5); // goes to minimum balance lock state
	}

}
