//ADDPENALTY

package actionpackage;

import datapackage.DataStore;

public class AddPenalty {

	// adds penalty of $20 in case of account 1
	public void addPenalty(DataStore d) {
		System.out.println("Adding penalty...");
		d.penalize();
	}
}
