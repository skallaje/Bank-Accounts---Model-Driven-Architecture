package datapackage;

public class DataStoreAcc2 extends DataStore {

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getTemp_key() {
		return temp_key;
	}

	public void setTemp_key(int temp_key) {
		this.temp_key = temp_key;
	}

	public int getTemp_aid() {
		return temp_aid;
	}

	public void setTemp_aid(int temp_aid) {
		this.temp_aid = temp_aid;
	}

	public int getTemp_b() {
		return temp_b;
	}

	public void setTemp_b(int temp_b) {
		this.temp_b = temp_b;
	}

	public int getTemp_d1() {
		return temp_d1;
	}

	public void setTemp_d1(int temp_d1) {
		this.temp_d1 = temp_d1;
	}

	public int getTemp_w1() {
		return temp_w1;
	}

	public void setTemp_w1(int temp_w1) {
		this.temp_w1 = temp_w1;
	}

	public int getTemp_b1() {
		return temp_b1;
	}

	public void setTemp_b1(int temp_b1) {
		this.temp_b1 = temp_b1;
	}

	public void incrementBalance() {
		this.setB(this.getB() + this.getTemp_d1());
	}

	public void decrementBalance() {
		this.setB(this.getB() - this.getTemp_w1());
	}

}