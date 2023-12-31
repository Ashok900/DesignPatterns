package flyweightpattern;

public class CounterTerrorist implements Player {

	// Intrinsic Attribute
	private String TASK;
	// Extrinsic Attribute
	private String weapon;

	
	public CounterTerrorist() {
		TASK = "DIFFUSE BOMB";
	}
	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}
	@Override
	public void mission() {
		System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
	}

}
