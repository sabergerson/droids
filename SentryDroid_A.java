package bergerson.DROID;

//SentryDroid_A class (subclass, extends ImperialDroid)
public class SentryDroid_A extends ImperialDroid {

	//Constructor
	public SentryDroid_A(String droidID) {
		super(droidID, "Alpha");

	}

	//Behaviors: instance methods
	//name: displaySDA
	//method: runs diagnostic check on droid components
	//input: none
	//output: void
	public void displaySDA() {
		super.runDiagnostic();
		
	}

}