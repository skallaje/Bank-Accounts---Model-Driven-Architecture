//OUTPUT_PROCESSOR

package mainpackage;

import datapackage.DataStore;
import actionpackage.*;

//this class contains the attributes and functions of the meta action classes for the account.
public class Output_Processor {

	StoreCredentials sc; // a reference for holding either account1 or 2's
							// StoreCredentials object
	TooManyAttemptsMsg tm;// a reference for holding either account1 or 2's
							// TooManyAttemptsMsg object
	AddPenalty ap;// a reference for holding AddPenalty object
	DisplayBalance db;// a reference for holding account1/2's displayBalance
						// object
	DisplayBelowMinBalMsg bm;// a reference for holding DisplayBelowMinBalMsg
								// object
	DisplayMenu dm;// a reference for holding account1/2's DisplayMenu object
	IncorrectLoginMsg il;// a reference for holding IncorrectLoginMsg object
	IncorrectPinMsg ip;// a reference for holding IncorrectPinMsg object
	MakeDeposit md;// a reference for holding account1/2's MakeDeposit object
	MakeWithdrawal mw;// a reference for holding account1/2's MakeWithdrawal
						// object
	Close cl;// a reference for holding account2's close object
	AbstractFactory abs;
	DataStore d;// a reference for holding account1/2's DataStore object

	// this constructor populates every reference declared above with a
	// corresponding object using AbstractFactory
	public Output_Processor(AbstractFactory a) {
		ap = a.getAddPenaltyObject();
		db = a.getDisplayBalanceObject();
		bm = a.getDisplayBelowMinBalMsgObject();
		dm = a.getDisplayMenuObject();
		il = a.getIncorrectLoginMsgObject();
		ip = a.getIncorrectPinMsgObject();
		md = a.getMakeDepositObject();
		mw = a.getMakeWithdrawalObject();
		sc = a.getStoreCredentialsObject();
		tm = a.getTooManyAttemptsMsgObject();
		d = a.getDataStoreObject();
		cl = a.getCloseObject();
	}

	// this constructor provides a link to the datastore object created in the
	// account classes initially to be used in the action class
	public Output_Processor(AbstractFactory abs, DataStore d1) {
		this(abs);
		d = d1;
	}

	// calls store credentials() for either account 1 or account 2
	public void storeCredentials() {
		sc.storeCredentials(d);
	}

	// calls account specific method for displaying invalid attempts msg
	public void tooManyAttemptsMsg() {
		tm.tooManyAttemptsMsg();
	}

	// calls addPenalty() for account 1
	public void addPenalty() {
		ap.addPenalty(d);
	}

	// calls account display balance method
	public void displayBalance() {
		db.displayBalance(d);
	}

	// calls generic method for displaying msg when balance is minimum
	public void displayBelowMinBalMsg() {
		bm.displayBelowMinBalMsg();
	}

	// calls account specific display menu implementation
	public void displayMenu() {
		dm.displayMenu();
	}

	// calls generic incorrectlogin msg method
	public void incorrectLoginMsg() {
		il.incorrectLoginMsg();
	}

	// calls generic incorrectPin msg method
	public void incorrectPinMsg() {
		ip.incorrectPinMsg();
	}

	// calls account specific make deposit()
	public void makeDeposit() {
		md.makeDeposit(d);
	}

	// calls account specific make depsoit()
	public void makeWithdrawal() {
		mw.makeWithdrawal(d);
	}

	// calls account-2's close method
	public void close() {
		cl.close();
	}
}