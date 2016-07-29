package datapackage;

public class DataStore {

	public String temp_p, temp_y, pin, id;
	public float temp_a, temp_d, temp_w, balance;

	public int key, aid, b, temp_key, temp_aid, temp_b, temp_d1, temp_w1,
			temp_b1;

	// gets stored temp pin
	public String getTemp_p() {
		return temp_p;
	}

	// stores temp pin
	public void setTemp_p(String temp_p) {
		this.temp_p = temp_p;
	}

	// gets temp id
	public String getTemp_y() {
		return temp_y;
	}

	// stores temp id
	public void setTemp_y(String temp_y) {
		this.temp_y = temp_y;
	}

	// gets pin
	public String getPin() {
		return pin;
	}

	// stores pin
	public void setPin(String pin) {
		this.pin = pin;
	}

	// gets id
	public String getId() {
		return id;
	}

	// stores id
	public void setId(String id) {
		this.id = id;
	}

	// gets temp initial balance
	public float getTemp_a() {
		return temp_a;
	}

	// stores temp initial balance
	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}

	// gets temp depposit amount
	public float getTemp_d() {
		return temp_d;
	}

	// stores temp deposit amount
	public void setTemp_d(float temp_d) {
		this.temp_d = temp_d;
	}

	// gets temp withdraw amount
	public float getTemp_w() {
		return temp_w;
	}

	// stores temp withdraw amount
	public void setTemp_w(float temp_w) {
		this.temp_w = temp_w;
	}

	// gets current balance
	public float getBalance() {
		return balance;
	}

	// stores/updates balance
	public void setBalance(float balance) {
		this.balance = balance;
	}

	// gets pin for account 2
	public int getKey() {
		return key;
	}

	// stores pin for account 2
	public void setKey(int key) {
		this.key = key;
	}

	// gets id for account 2
	public int getAid() {
		return aid;
	}

	// stores id for account 2
	public void setAid(int aid) {
		this.aid = aid;
	}

	// gets current balance for account 2
	public int getB() {
		return b;
	}

	// stores/updates balance for account 2
	public void setB(int b) {
		this.b = b;
	}

	// gets temp pin for account 2
	public int getTemp_key() {
		return temp_key;
	}

	// stores temp pin for account 2
	public void setTemp_key(int temp_key) {
		this.temp_key = temp_key;
	}

	// stores temp id for account 2
	public int getTemp_aid() {
		return temp_aid;
	}

	// stores temp id for account 2
	public void setTemp_aid(int temp_aid) {
		this.temp_aid = temp_aid;
	}

	// gets temp balance for account 2
	public int getTemp_b() {
		return temp_b;
	}

	// stores temp balance for account 2
	public void setTemp_b(int temp_b) {
		this.temp_b = temp_b;
	}

	// gets temp deposit amount for account 2
	public int getTemp_d1() {
		return temp_d1;
	}

	// sets temp deposit amount for account 2
	public void setTemp_d1(int temp_d1) {
		this.temp_d1 = temp_d1;
	}

	// gets temp withdraw amount for account 2
	public int getTemp_w1() {
		return temp_w1;
	}

	// stores temp withdraw amount for account 2
	public void setTemp_w1(int temp_w1) {
		this.temp_w1 = temp_w1;
	}

	// gets temp balance for account 2
	public int getTemp_b1() {
		return temp_b1;
	}

	// stores temp balance for account 2
	public void setTemp_b1(int temp_b1) {
		this.temp_b1 = temp_b1;
	}

	// increments balance during deposit operation
	public void incrementBalance() {

	}

	// decrements balance during withdraw operation
	public void decrementBalance() {

	}

	// add penalty implementation
	public void penalize() {

	}
}