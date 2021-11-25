package bergerson.DROID;

//Import necessary modules
import java.util.TreeMap;

import bergerson.ARMS.Arm;
import bergerson.ARMS.LeftArm;
import bergerson.ARMS.RightArm;
import bergerson.BODIES.Cranial;
import bergerson.BODIES.Torso;
import bergerson.INTERFACES.DroidActions;
import bergerson.INTERFACES.DroidOperations;
import bergerson.LEGS.LeftLeg;
import bergerson.LEGS.Leg;
import bergerson.LEGS.RightLeg;

//ImperialDroid class (superclass, abstract)
public abstract class ImperialDroid implements DroidActions, DroidOperations {
	
	//Data fields
	private String DroidID;
	private String DroidType;
	private Cranial Head;
	private Torso UpperTorso;
	private TreeMap<String,Arm> Arms = new TreeMap<String,Arm>();
	private TreeMap<String,Leg> Legs = new TreeMap<String,Leg>();
	
	//Constructor
	public ImperialDroid(String droidID, String droidType) {
		this.DroidID = droidID;
		this.DroidType = droidType;
		
		this.Head = new Cranial("x");
		this.UpperTorso = new Torso("x");
		
		this.Arms.put("Right Arm", new RightArm("x"));
		this.Arms.put("Left Arm", new LeftArm("x"));
		
		this.Legs.put("Right Leg", new RightLeg("x"));
		this.Legs.put("Left Leg", new LeftLeg("x"));
		
	}
	
	//Implemented methods (Interfaces)
	//name: displayInfo (DroidActions)
	//method: displays iDNumber and type
	//input: none
	//output: void
	@Override
	public void displayInfo() {
		System.out.println("Droid ID: "+this.getDroidID());
		System.out.println("Droid Type: "+this.getDroidType());
		System.out.println("******");
		
	}
	
	//name: runDiagnostics (DroidOperations)
	//method: checks if droid components are operational, displays status
	//input: none
	//output: void
	@Override
	public void runDiagnostic() {
		//display info
		this.displayInfo();
		//initialize status to normal
		String head_stat = "Normal";
		String torso_stat = "Normal";
		String rArm_stat = "Normal";
		String lArm_stat = "Normal";
		String rLeg_stat = "Normal";
		String lLeg_stat = "Normal";
		//check each component, update status if not operational
		if (this.Head.isOperational() != true) {
			head_stat = "ERROR!!";
		}
		if (this.UpperTorso.isOperational() != true) {
			torso_stat = "ERROR!!";
		}
		if (((RightArm) this.Arms.get("Right Arm")).isOperational() != true) {
			rArm_stat = "ERROR!!";
		}
		if (((LeftArm) this.Arms.get("Left Arm")).isOperational() != true) {
			lArm_stat = "ERROR!!";
		}
		if (((RightLeg) this.Legs.get("Right Leg")).isOperational() != true) {
			rLeg_stat = "ERROR!!";
		}
		if (((LeftLeg) this.Legs.get("Left Leg")).isOperational() != true) {
			lLeg_stat = "ERROR!!";
		}
		//notify if components are malfunctioning, otherwise norify as normal
		if (head_stat == "ERROR!!"||torso_stat == "ERROR!!"||rArm_stat == "ERROR!!"
				||lArm_stat == "ERROR!!"||rLeg_stat == "ERROR!!"||lLeg_stat == "ERROR!!") {
			System.out.println("Droid has Malfunctioning Component(s)");
		}
		else {
			System.out.println("Droid Operating Within Normal Parameters");
		}
		//display status summary
		System.out.println("                Component Status");
		System.out.println("HEAD Check:Head "+head_stat);
		System.out.println("UPPER TORSO Check:Upper Torso "+torso_stat);
		System.out.println("ARMS Check:Left Arm "+lArm_stat+" Right Arm "+rArm_stat);
		System.out.println("LEGS Check:Left Leg "+lLeg_stat+" Right Leg "+rLeg_stat);
				
	}

	//Accessors and mutators
	public String getDroidID() {
		return DroidID;
	}

	public void setDroidID(String droidID) {
		this.DroidID = droidID;
	}

	public String getDroidType() {
		return DroidType;
	}

	public void setDroidType(String droidType) {
		this.DroidType = droidType;
	}

	public Cranial getHead() {
		return Head;
	}

	public void setHead(Cranial head) {
		this.Head = head;
	}

	public Torso getUpperTorso() {
		return UpperTorso;
	}

	public void setUpperTorso(Torso upperTorso) {
		this.UpperTorso = upperTorso;
	}

	public TreeMap<String, Arm> getArms() {
		return Arms;
	}

	public void setArms(TreeMap<String, Arm> arms) {
		this.Arms = arms;
	}

	public TreeMap<String, Leg> getLegs() {
		return Legs;
	}

	public void setLegs(TreeMap<String, Leg> legs) {
		this.Legs = legs;
	}

}