package bergerson.LEGS;

//RightLeg class (subclass, extends Leg)
public class RightLeg extends Leg {

	//Data fields
	private boolean operational;
	
	//Constructor
	public RightLeg(String iDNumber) {
		super("x", "Right Leg");
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