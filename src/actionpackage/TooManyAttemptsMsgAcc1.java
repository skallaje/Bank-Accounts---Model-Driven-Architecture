//STRATEGY PATTERN FOR TOOMANYATTEMPTSPINMSGACC1

package actionpackage;

public class TooManyAttemptsMsgAcc1 extends TooManyAttemptsMsg {

	// displays account 1's too many invalid attempts msg
	public void tooManyAttemptsMsg() {
		System.out
				.println("You have entered incorrect pin thrice. Please login again and enter correct pin.");
	}

}
