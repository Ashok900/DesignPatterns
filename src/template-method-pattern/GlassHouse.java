package templatemethodpattern;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("Building Glass walls");
		
	}

	@Override
	public void buildPillers() {
		System.out.println("Building pillars with glass coating");
		
	}

}
