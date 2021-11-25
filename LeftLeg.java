package bergerson.LEGS;

//LeftLeg class (subclass, extends Leg)
public class LeftLeg extends Leg {

	//Data fields
	private boolean operational;
	
	//Constructor
	public LeftLeg(String iDNumber) {
		super("x", "Left Leg");
		this.operational = true;
	}

	//Implemented methods (Leg)
	//name: displayInfo
	//methods: displays iDNumber and type
	//input: none
	//output: void
	@Override
	public void displayInfo() {
		System.out.println("Leg ID: "+this.getiDNumber()+"Leg Type: "+this.getlType());
		
	}
	
	//Accessors and mutators
	public boolean isOperational() {
		return operational;
	}

	public void setOperational(boolean operational) {
		this.operational = operational;
	}

}