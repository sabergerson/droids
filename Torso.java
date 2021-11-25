package bergerson.BODIES;

//Torso class (subclass, extends Body)
public class Torso extends Body {

	//Data fields
	private boolean operational;
	
	//Constructor
	public Torso(String iDNumber) {
		super("x", "Torso");
		this.operational = true;
	}

	//Implemented methods (Body)
	//name: displayInfo
	//method: displays iDNumber and type
	//input: none
	//output: void
	@Override
	public void displayInfo() {
		System.out.println("Body ID: "+this.getiDNumber()+"Body Type: "+this.getbType());
		
	}
	
	//Accessors and mutators
	public boolean isOperational() {
		return operational;
	}

	public void setOperational(boolean operational) {
		this.operational = operational;
	}

}