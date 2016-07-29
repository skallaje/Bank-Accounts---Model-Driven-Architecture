//DECENTRALIZED STATE PATTERN FOR MINBALANCELOCK

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class MinBalanceLock extends EFSM_States {

	public MinBalanceLock(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void aboveMin() {
		m.change_state(3); // goes to ready state
	}

	public void belowMin() {
		m.change_state(6); // goes to overdrawn state
	}

}
