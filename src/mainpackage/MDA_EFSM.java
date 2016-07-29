//DECENTRALIZED STATE PATTERN FOR MDA-EFSM CONTEXT CLASS

package mainpackage;

import statepackage.*;

//generic/abstract implementation of the various account operations. Note that each of the functions call current state's counterpart
public class MDA_EFSM {

	public EFSM_States[] ls; // list of account states
	public EFSM_States s; // for the current state object
	public int attempts; // for storing pin attempts count

	public MDA_EFSM() {
		attempts = 0;// initially attempts will be zero
	}

	public void open() {
		s.open();// current state's open()
	}

	public void incorrectPin(int max) {
		s.incorrectPin(max);// current state's incorrectPin(max)
	}

	public void correctPinAboveMin() {
		s.correctPinAboveMin();// current state's correctPinAboveMin()
	}

	public void correctPinBelowMin() {
		s.correctPinBelowMin();// current state's correctPinBelowMin()
	}

	public void deposit() {
		s.deposit();// current state's deposit()
	}

	public void aboveMin() {
		s.aboveMin();// current state's aboveMin()
	}

	public void belowMin() {
		s.belowMin();// current state's belowMin()
	}

	public void withdraw() {
		s.withdraw();// current state's withdraw()
	}

	public void forbidWithdraw() {
		s.forbidWithdraw();// current state's forbidWithdraw()
	}

	public void balance() {
		s.balance();// current state's balance()
	}

	public void login() {
		s.login();// current state's login()
	}

	public void incorrectLogin() {
		s.incorrectLogin();// current state's incorrectLogin()
	}

	public void logout() {
		s.logout();// current state's logout()
	}

	public void correctLock() {
		s.correctLock();// current state's correctLock()
	}

	public void incorrectUnlock() {
		s.incorrectUnlock();// current state's incorrectUnlock()
	}

	public void incorrectLock() {
		s.incorrectLock();// current state's incorrectUnlock()
	}

	public void correctUnlock() {
		s.correctUnlock();// current state's correctUnlock()
	}

	public void close() {
		s.close();// current state's close()
	}

	public void suspend() {
		s.suspend();// current state's suspend()
	}

	public void activate() {
		s.activate();// current state's activate()
	}

	// changes the current state to point to a specific state object
	public EFSM_States change_state(int i) {
		s = ls[i];
		return s;
	}
}