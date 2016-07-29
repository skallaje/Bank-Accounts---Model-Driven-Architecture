//DECENTRALIZED STATE PATTERN FOR MINIMUMBALANCE

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class MinimumBalance extends EFSM_States {

	public MinimumBalance(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

	public void aboveMin() {
		m.change_state(3); // goes to ready state
	}

	public void belowMin() {
		op.addPenalty(); // calls add penalty() when withdraw is called for min
							// balance situation
		m.change_state(6); // goes to overdrawn state
	}

}
