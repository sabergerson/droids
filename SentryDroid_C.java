package bergerson.DROID;

//SentryDroid_C class (subclass, extends ImperialDroid)
public class SentryDroid_C extends ImperialDroid {

	//Constructor
	public SentryDroid_C(String droidID) {
		super(droidID, "Gamma");

	}

	//Behaviors: instance methods
	//name: displaySDA
	//method: runs diagnostic check on droid components
	//input: none
	//output: void
	public void displaySDC() {
		super.runDiagnostic();
		
	}
	
}