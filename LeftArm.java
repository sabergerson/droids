package bergerson.ARMS;

//LeftArm class (subclass, extends Arm)
public class LeftArm extends Arm {
	
	//Data fields
	private boolean operational;

	//Constructor
	public LeftArm(String iDNumber) {
		super("x", "Left Arm");
		this.operational = true;
	}

	//Implemented methods (Arm)
	//name: displayInfo
	//method: displays iDNumber and type
	//input: none
	//output: void
	@Override
	public void displayInfo() {
		System.out.println("Arm ID: "+this.getiDNumber()+"Arm Type: "+this.getaType());
		
	}

	//Accessors and mutators
	public boolean isOperational() {
		return operational;
	}

	public void setOperational(boolean operational) {
		this.operational = operational;
	}
	
}