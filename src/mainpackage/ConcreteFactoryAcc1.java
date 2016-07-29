//ABSTRACT FACTORY PATTERN IMPLEMENTATION FOR ACCOUNT 1

package mainpackage;

import datapackage.*;
import actionpackage.*;

//Implementation of abstract factory's methods for ACCOUNT-1
public class ConcreteFactoryAcc1 extends AbstractFactory {

	@Override
	StoreCredentials getStoreCredentialsObject() {
		// TODO Auto-generated method stub
		return new StoreCredentialsAcc1(); // returns object of the class that
											// contains account 1 store
											// implementation
	}

	@Override
	TooManyAttemptsMsg getTooManyAttemptsMsgObject() {
		// TODO Auto-generated method stub
		return new TooManyAttemptsMsgAcc1(); // returns object of the class that
												// contains account 1 display
												// invalid attempts
												// implementation
	}

	@Override
	AddPenalty getAddPenaltyObject() {
		// TODO Auto-generated method stub
		return new AddPenalty(); // returns object of the class that contains
									// add penalty implementation
	}

	@Override
	DisplayBalance getDisplayBalanceObject() {
		// TODO Auto-generated method stub
		return new DisplayBalanceAcc1(); // returns object of the class that
											// contains account-1's display
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
		return new DisplayMenuAcc1(); // return object of the class that
										// contains implementation for menu
										// display for account 1
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
		return new MakeDepositAcc1(); // returns object of the class that
										// contains implementation of account 1
										// deposit
	}

	@Override
	MakeWithdrawal getMakeWithdrawalObject() {
		// TODO Auto-generated method stub
		return new MakeWithdrawalAcc1(); // returns object of the class that
											// contains implementation of
											// account 1 withdrawal
	}

	@Override
	DataStore getDataStoreObject() {
		// TODO Auto-generated method stub
		return new DataStoreAcc1(); // returns object of the class for storing
									// data implementation of account 1
	}

	@Override
	Close getCloseObject() {
		// TODO Auto-generated method stub
		return null; // no implementation of close for account 1, so null
	}
}