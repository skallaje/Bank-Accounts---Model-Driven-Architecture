//DRIVER

package mainpackage;

import java.util.Scanner;

public class Driver {

	// displays available operations (in a loop) of account 1 for the user
	public void Acc1Operation(Scanner keyboard, int input, Account_1 a) {
		switch (input) {
		case 0:
			System.out.println("Open method called");
			System.out.println("Enter a value for pin :");
			String pin = keyboard.next();
			System.out.println("Enter a value for id :");
			String id = keyboard.next();
			System.out.println("Enter a float value for balance :");
			float bal = keyboard.nextFloat();
			a.open(pin, id, bal);
			break;

		case 1:
			System.out.println("Login method called");
			System.out.println("Enter a value for id :");
			String lid = keyboard.next();
			a.login(lid);
			break;

		case 2:
			System.out.println("Pin method called");
			System.out.println("Enter a value for pin :");
			String apin = keyboard.next();
			a.pin(apin);
			break;

		case 3:
			System.out.println("Deposit method called");
			System.out.println("Enter a float value for d :");
			float d = keyboard.nextFloat();
			a.deposit(d);
			break;

		case 4:
			System.out.println("Withdraw method called");
			System.out.println("Enter a float value for w :");
			float w = keyboard.nextFloat();
			a.withdraw(w);
			break;

		case 5:
			System.out.println("Balance method called");
			a.balance();
			break;

		case 6:
			System.out.println("Lock method called");
			System.out.println("Enter a value for pin :");
			String spin = keyboard.next();
			a.lock(spin);
			break;

		case 7:
			System.out.println("Unlock method called");
			System.out.println("Enter a value for pin :");
			String upin = keyboard.next();
			a.unlock(upin);
			break;

		case 8:
			System.out.println("Logout method called");
			a.logout();
			break;

		default:
			System.exit(0);

		}
	}

	// displays available operations (in a loop) of account 2 for the user
	public void Acc2Operation(Scanner keyboard, int input, Account_2 a) {
		switch (input) {
		case 0:
			System.out.println("OPEN method called");
			System.out.println("Enter an integer value for pin :");
			int pin = keyboard.nextInt();
			System.out.println("Enter an integer value for id :");
			int id = keyboard.nextInt();
			System.out.println("Enter an integer value for balance :");
			int bal = keyboard.nextInt();
			a.OPEN(pin, id, bal);
			break;

		case 1:
			System.out.println("LOGIN method called");
			System.out.println("Enter an integer value for id :");
			int lid = keyboard.nextInt();
			a.LOGIN(lid);
			break;

		case 2:
			System.out.println("PIN method called");
			System.out.println("Enter an integer value for pin :");
			int apin = keyboard.nextInt();
			a.PIN(apin);
			break;

		case 3:
			System.out.println("DEPOSIT method called");
			System.out.println("Enter an integer value for d :");
			int d = keyboard.nextInt();
			a.DEPOSIT(d);
			break;

		case 4:
			System.out.println("WITHDRAW method called");
			System.out.println("Enter an integer value for w :");
			int w = keyboard.nextInt();
			a.WITHDRAW(w);
			break;

		case 5:
			System.out.println("BALANCE method called");
			a.BALANCE();
			break;

		case 6:
			System.out.println("SUSPEND method called");
			a.suspend();
			break;

		case 7:
			System.out.println("ACTIVATE method called");
			a.activate();
			break;

		case 8:
			System.out.println("LOGOUT method called");
			a.LOGOUT();
			break;

		case 9:
			System.out.println("CLOSE method called");
			a.close();
			break;

		default:
			System.exit(0);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver dr = new Driver();
		Account_1 a1 = null;
		Account_2 a2 = null;

		Scanner keyboard = new Scanner(System.in); // to accept user's input

		System.out.println("Enter 1 for Account 1, 2 for account 2");
		int ac_type = keyboard.nextInt(); // to accept user's input choice for
											// account

		if (ac_type == 1) {
			AbstractFactory abs = new ConcreteFactoryAcc1();
			MDA_EFSM m = new MDA_EFSM(); // creates instance of MDA EFSM class
			a1 = new Account_1(m, abs); // creates an instance of the account 1
										// class with an MDA EFSM link
			System.out
					.println("Enter a number between 0 and 8 for the following operations:");
		} else {
			AbstractFactory abs = new ConcreteFactoryAcc2();
			MDA_EFSM m = new MDA_EFSM(); // creates instance of MDA EFSM class
			a2 = new Account_2(m, abs); // creates an instance of the account 1
										// class with an MDA EFSM link
			System.out
					.println("Enter a number between 0 and 9 for the following operations:");
		}

		for (;;) {
			try {
				if (ac_type == 1) { // for account 1
					System.out
							.println("Open-0 Login-1 Pin-2 Deposit-3 Withdraw-4 Balance-5 Lock-6 Unlock-7 Logout-8\n");

					String input = keyboard.next();

					if (isInteger(input))
						dr.Acc1Operation(keyboard, Integer.valueOf(input), a1);
					else {
						System.exit(0);
						System.out
								.println("Please enter a number between 0 and 8");
					}
				} else { // for account 2
					System.out
							.println("OPEN-0 LOGIN-1 PIN-2 DEPOSIT-3 WITHDRAW-4 BALANCE-5 SUSPEND-6 ACTIVATE-7 LOGOUT-8 CLOSE-9\n");

					String input = keyboard.next();

					if (isInteger(input))
						dr.Acc2Operation(keyboard, Integer.valueOf(input), a2);
					else {
						System.exit(0);
						System.out
								.println("Please enter a number between 0 and 9");
					}
				}
			} catch (Exception e) {
				System.out.println("Please enter valid values for the input.");
				System.exit(0);
			}
		}

	}

	public static boolean isInteger(String prc) {
		boolean flag = true;
		try {
			Integer.parseInt(prc);
		} catch (NumberFormatException e) {
			flag = false;
		}
		return flag;
	}
}