package bergerson.BODIES;

//Cranial class (subfield, extends Body)
public class Cranial extends Body {

	//Data fields
	private boolean operational;
	
	//Constructor
	public Cranial(String iDNumber) {
		super("x", "Cranial");
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