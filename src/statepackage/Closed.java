//DECENTRALIZED STATE PATTERN FOR CLOSED

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;

public class Closed extends EFSM_States {

	public Closed(MDA_EFSM m1, AbstractFactory a, DataStore d1) {
		super(m1, a, d1);
	}

}
