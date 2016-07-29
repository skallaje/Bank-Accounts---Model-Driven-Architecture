//DECENTRALIZED STATE PATTERN FOR IDLE

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Idle extends EFSM_States {

	public Idle(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void incorrectLogin() {
		op.incorrectLoginMsg(); // displays incorrect login msg
	}

	public void login() {
		m.attempts=0;
		m.change_state(2); // goes to check pin state
	}
}
