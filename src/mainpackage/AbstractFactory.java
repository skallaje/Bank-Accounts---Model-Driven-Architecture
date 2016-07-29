//ABSTRACT FACTORY PATTERN

package mainpackage;

import datapackage.DataStore;
import actionpackage.*;

//empty implementations of the functions to be implemented by the concrete factory classes of the account
public abstract class AbstractFactory {

	abstract StoreCredentials getStoreCredentialsObject();

	// gets either Account 1’s or Account 2’s object of StoreCredentials

	abstract TooManyAttemptsMsg getTooManyAttemptsMsgObject();

	// gets either Account 1’s or Account 2’s object of TooManyAttemptsMsg

	abstract AddPenalty getAddPenaltyObject();

	// gets an object of the class AddPenalty

	abstract DisplayBalance getDisplayBalanceObject();

	// gets either Account 1’s or Account 2’s object of DisplayBalance

	abstract DisplayBelowMinBalMsg getDisplayBelowMinBalMsgObject();

	// gets an object of the class DisplayBelowMinBalMsg

	abstract DisplayMenu getDisplayMenuObject();

	// gets either Account 1’s or Account 2’s object of DisplayMenu

	abstract IncorrectLoginMsg getIncorrectLoginMsgObject();

	// gets an object of IncorrectLoginMsg

	abstract IncorrectPinMsg getIncorrectPinMsgObject();

	// gets an object of IncorrectPinMsg

	abstract MakeDeposit getMakeDepositObject();

	// gets either Account 1’s or Account 2’s object of the MakeDeposit

	abstract MakeWithdrawal getMakeWithdrawalObject();

	// gets either Account 1’s or Account 2’s object of MakeWithdrawal

	abstract DataStore getDataStoreObject();

	// gets either Account 1’s or Account 2’s object of DataStore

	abstract Close getCloseObject();
	
	// gets an object of Close
}