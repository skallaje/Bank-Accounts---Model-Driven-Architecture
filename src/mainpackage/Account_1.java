//ACCOUNT-1

package mainpackage;

import datapackage.*;
import statepackage.*;

public class Account_1 {

	public MDA_EFSM m;
	DataStore d;

	// constructor that initializes connections to the MDA EFSM and datastore
	public Account_1(MDA_EFSM m1, AbstractFactory abs) {
		m = m1;
		m.ls = new EFSM_States[10];
		d = abs.getDataStoreObject();
		m.s = new EFSM_States(m, abs, d);
		m.ls[0] = new Start(m, abs, d); // start state object
		m.ls[1] = new Idle(m, abs, d); // Idle state object
		m.ls[2] = new CheckPin(m, abs, d); // check pin state object
		m.ls[3] = new Ready(m, abs, d); // ready state object
		m.ls[4] = new MinimumBalance(m, abs, d); // minimum balance state object
		m.ls[5] = new MinBalanceLock(m, abs, d); // minimum balance lock state
													// object
		m.ls[6] = new Overdrawn(m, abs, d); // overdrawn state object
		m.ls[7] = new Locked(m, abs, d); // locked state object
		m.ls[8] = new Suspended(m, abs, d); // suspended state object
		m.ls[9] = new Closed(m, abs, d); // closed state object
		m.s = m.ls[0]; // initially the MDA EFSM is in start state
	}

	void open(String p, String y, float a) {
		d.setTemp_a(a); // stores initial balance in a temp variable in
						// datastore
		d.setTemp_y(y); // stores id in datastore
		d.setTemp_p(p); // stores pin in dattastore
		m.open(); // calls MDA EFSM open()
	}

	void pin(String x) {
		if (x.equals(d.getPin())) {
			if (d.getBalance() > 500) {
				m.correctPinAboveMin(); // if entered pin equals the pin stored
										// in datastore and balance > 500 , go
										// to ready state
			} else {
				m.correctPinBelowMin(); // if entered pin equals the pin stored
										// in datastore and balance <= 500 , go
										// to overdrawn state
			}
		} else {
			m.attempts++; // increment count if entered pin is invalid
			m.incorrectPin(3); // calls MDA EFSM incorrectPin()
		}
	}

	void deposit(float d1) {
		d.setTemp_d(d1); // stores amount in a temp variable in datastore
		m.deposit(); // calls MDA EFSM deposit()

		if (d.getBalance() > 500)
			m.aboveMin(); // stay in ready state if balance is > 500
		else {
			m.belowMin(); // goto overdrawn state if balance < 500
		}
	}

	void withdraw(float w) {
		d.setTemp_w(w); // stores amount in a temp variable in datastore
		m.withdraw(); // calls MDA EFSM depsoit()
		if (d.getBalance() > 500) {
			m.aboveMin(); // stay in ready state if balance is > 500
		} else {
			m.belowMin(); // goto overdrawn state if balance < 500
		}
	}

	void balance() {
		m.balance(); // calls MDA EFSM balance()
	}

	void login(String y) {
		if (y.equals(d.getId())) {
			m.login(); // calls MDA EFSM login() if entered ID is equal to the
						// one stored in datastore
		} else {
			m.incorrectLogin(); // if not call MDA EFSM incorrectLogin()
		}
	}

	void logout() {
		m.logout(); // calls MDA EFSM logout()
	}

	void lock(String x) {
		if (x.equals(d.getPin())) {
			m.correctLock(); // calls MDA EFSM correctLock() if entered pin ==
								// one stored in datastore
		} else
			m.incorrectLock(); // else calls MDA EFSM incorrectlock()
	}

	void unlock(String y) {
		if (y.equals(d.getPin())) {
			m.correctUnlock(); // calls MDA EFSM correctunlock() if entered pin
								// == datastore's pin
			if (d.getBalance() > 500) {
				m.aboveMin(); // goes to ready state
			} else {
				m.belowMin(); // goes to overdrawn state
			}
		} else
			m.incorrectUnlock(); // calls incorrectUnlock of MDA EFSM
	}
}