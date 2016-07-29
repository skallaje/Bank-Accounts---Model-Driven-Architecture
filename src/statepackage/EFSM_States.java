//DECENTRALIZED STATE PATTERN FOR STATE EFSM_STATES

package statepackage;

import datapackage.DataStore;
import mainpackage.AbstractFactory;
import mainpackage.MDA_EFSM;
import mainpackage.Output_Processor;

//this class contains generic methods with no implementation
public class EFSM_States {

	MDA_EFSM m;
	public Output_Processor op;

	public EFSM_States(MDA_EFSM m1, AbstractFactory abs, DataStore d1) {
		m = m1;
		op = new Output_Processor(abs, d1); // pointer to output processor
											// object
	}

	public EFSM_States() {

	}

	public void open() {

	}

	public void incorrectPin(int max) {

	}

	public void correctPinAboveMin() {

	}

	public void correctPinBelowMin() {

	}

	public void deposit() {

	}

	public void aboveMin() {

	}

	public void belowMin() {

	}

	public void withdraw() {
	}

	public void forbidWithdraw() {

	}

	public void balance() {

	}

	public void login() {

	}

	public void incorrectLogin() {

	}

	public void logout() {

	}

	public void correctLock() {

	}

	public void incorrectUnlock() {

	}

	public void incorrectLock() {

	}

	public void correctUnlock() {

	}

	public void close() {

	}

	public void suspend() {

	}

	public void activate() {

	}
}