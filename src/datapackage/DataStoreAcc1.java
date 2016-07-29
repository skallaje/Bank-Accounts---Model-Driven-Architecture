package datapackage;

public class DataStoreAcc1 extends DataStore {

	public DataStoreAcc1() {

	}

	public String getTemp_p() {
		return temp_p;
	}

	public void setTemp_p(String temp_p) {
		this.temp_p = temp_p;
	}

	public String getTemp_y() {
		return temp_y;
	}

	public void setTemp_y(String temp_y) {
		this.temp_y = temp_y;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getTemp_a() {
		return temp_a;
	}

	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}

	public float getTemp_d() {
		return temp_d;
	}

	public void setTemp_d(float temp_d) {
		this.temp_d = temp_d;
	}

	public float getTemp_w() {
		return temp_w;
	}

	public void setTemp_w(float temp_w) {
		this.temp_w = temp_w;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void incrementBalance() {
		this.setBalance(this.getBalance() + this.getTemp_d());
	}

	public void decrementBalance() {
		this.setBalance(this.getBalance() - this.getTemp_w());
	}

	public void penalize() {
		this.setBalance(this.getBalance() - 20);
	}
}
