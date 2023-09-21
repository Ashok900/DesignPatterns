package flyweightpattern;

public class Terrorist implements Player{
	// Intrinsic Attribute
	private  String TASK;
	// Extrinsic Attribute
	private String weapon;
	
	 public Terrorist()
	    {
	        TASK = "PLANT A BOMB";
	    }

	@Override
	public void assignWeapon(String weapon) {
		this.weapon=weapon;	
	}

	@Override
	public void mission() {
		 System.out.println("Terrorist with weapon "+ weapon + "|" + " Task is " + TASK);	
	}

}
