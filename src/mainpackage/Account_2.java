//ACCOUNT-2

package mainpackage;

import datapackage.*;
import statepackage.CheckPin;
import statepackage.Closed;
import statepackage.EFSM_States;
import statepackage.Idle;
import statepackage.Locked;
import statepackage.MinBalanceLock;
import statepackage.MinimumBalance;
import statepackage.Overdrawn;
import statepackage.Ready;
import statepackage.Start;
import statepackage.Suspended;

public class Account_2 {

	public MDA_EFSM m;
	DataStore d;

	// initializes connections to MDA EFSM and datastore
	public Account_2(MDA_EFSM m1, AbstractFactory abs) {
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
		m.s = m.ls[0];
	}

	// stores entered valid input values in datastore and calls MDA EFSM open()
	void OPEN(int p, int y, int a) {
		d.setTemp_b(a);
		d.setTemp_aid(y);
		d.setTemp_key(p);
		m.open();
	}

	void PIN(int x) {
		if (x == d.getKey()) {
			m.correctPinAboveMin(); // if entered pin equals the pin stored in
									// datastore, go to ready state
		} else {
			m.attempts++; // increment count if entered pin is invalid
			m.incorrectPin(2); // calls MDA EFSM incorrectPin()
		}

	}

	void DEPOSIT(int d1) {
		d.setTemp_d1(d1); // stores amount in a temp variable in datastore
		m.deposit(); // calls MDA EFSM deposit()
	}

	void WITHDRAW(int w) {
		d.setTemp_w1(w); // stores amount in a temp variable in datastore
		if (d.getB() > 0) {
			m.withdraw(); // calls MDA EFSM depsoit()
			m.aboveMin(); // stay in ready state if balance is > 500
		} else {
			m.forbidWithdraw(); // forbid the user from withdrawing
		}
	}

	void BALANCE() {
		m.balance(); // calls MDA EFSM balance()
	}

	void LOGIN(int y) {
		if (y == d.getAid()) {
			m.login(); // calls MDA EFSM login() if entered ID is equal to the
						// one stored in datastore
		} else {
			m.incorrectLogin(); // if not call MDA EFSM incorrectLogin()
		}
	}

	void LOGOUT() {
		m.logout(); // calls MDA EFSM logout()
	}

	void close() {
		m.close(); // calls MDA EFSM close()
	}

	void suspend() {
		m.suspend(); // calls MDA EFSM suspend()
	}

	void activate() {
		m.s.activate(); // calls MDA EFSM activate()
	}
}
