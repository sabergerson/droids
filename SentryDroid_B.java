package bergerson.DROID;

//SentryDroid_B class (subclass, extends ImperialDroid)
public class SentryDroid_B extends ImperialDroid {

	//Constructor
	public SentryDroid_B(String droidID) {
		super(droidID, "Beta");
		
	}
	
	//Behaviors: instance methods
	//name: displaySDA
	//method: runs diagnostic check on droid components
	//input: none
	//output: void
	public void displaySDB() {
		super.runDiagnostic();
		
	}

}