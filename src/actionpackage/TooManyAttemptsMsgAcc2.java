//STRATEGY PATTERN FOR TOOMANYATTEMPTSPINMSGACC2

package actionpackage;

public class TooManyAttemptsMsgAcc2 extends TooManyAttemptsMsg {

	// displays account 2's too many invalid attempts msg
	public void tooManyAttemptsMsg() {
		System.out
				.println("You have entered incorrect pin twice. Please login again and enter correct pin.");
	}

}
