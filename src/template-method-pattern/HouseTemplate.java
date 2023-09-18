package templatemethodpattern;

/*
 * buildHouse() is the template method and defines the order of execution for performing several steps.
 */
public abstract class HouseTemplate {
	
	public final void buildHouse() {
		buildFoundation();
		buildPillers();
		buildWalls();
		buildWindowns();
		System.out.println("The house is built.");
	}

	private void buildWindowns() {
		System.out.println("Building glass windows");
	}

	public abstract void buildWalls();

	public abstract void buildPillers();

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	};

}
