//ABSTRACT FACTORY PATTERN IMPLEMENTATION FOR ACCOUNT 2

package mainpackage;

import datapackage.DataStore;
import datapackage.DataStoreAcc2;
import actionpackage.*;

//Implementation of abstract factory's methods for ACCOUNT-2
public class ConcreteFactoryAcc2 extends AbstractFactory {

	@Override
	StoreCredentials getStoreCredentialsObject() {
		// TODO Auto-generated method stub
		return new StoreCredentialsAcc2(); // returns object of the class that
											// contains account 2 store
											// implementation
	}

	@Override
	TooManyAttemptsMsg getTooManyAttemptsMsgObject() {
		// TODO Auto-generated method stub
		return new TooManyAttemptsMsgAcc2(); // returns object of the class that
												// contains account 2 display
												// invalid attempts
												// implementation
	}

	@Override
	AddPenalty getAddPenaltyObject() {
		// TODO Auto-generated method stub
		return null; // no penalty in case of account 2
	}

	@Override
	DisplayBalance getDisplayBalanceObject() {
		// TODO Auto-generated method stub
		return new DisplayBalanceAcc2(); // returns object of the class that
											// contains account 2's display
											// balance implementation
	}

	@Override
	DisplayBelowMinBalMsg getDisplayBelowMinBalMsgObject() {
		// TODO Auto-generated method stub
		return new DisplayBelowMinBalMsg(); // returns object of the class that
											// contains display min bal msg
											// implementation
	}

	@Override
	DisplayMenu getDisplayMenuObject() {
		// TODO Auto-generated method stub
		return new DisplayMenuAcc2(); // return object of the class that
										// contains implementation for menu
										// display for account 2
	}

	@Override
	IncorrectLoginMsg getIncorrectLoginMsgObject() {
		// TODO Auto-generated method stub
		return new IncorrectLoginMsg(); // returns object of the class that
										// contains implementation of incorrect
										// login msg display
	}

	@Override
	IncorrectPinMsg getIncorrectPinMsgObject() {
		// TODO Auto-generated method stub
		return new IncorrectPinMsg(); // returns object of the class that
										// contains implementation of incorrect
										// pin msg display
	}

	@Override
	MakeDeposit getMakeDepositObject() {
		// TODO Auto-generated method stub
		return new MakeDepositAcc2(); // returns object of the class that
										// contains implementation of account 2
										// deposit
	}

	@Override
	MakeWithdrawal getMakeWithdrawalObject() {
		// TODO Auto-generated method stub
		return new MakeWithdrawalAcc2(); // returns object of the class that
											// contains implementation of
											// account 2 withdrawal
	}

	@Override
	DataStore getDataStoreObject() {
		// TODO Auto-generated method stub
		return new DataStoreAcc2(); // returns object of the class for storing
									// data implementation of account 2
	}

	@Override
	Close getCloseObject() {
		// TODO Auto-generated method stub
		return new Close(); // returns object of the class that contains
							// implementation for closing account 2
	}
}