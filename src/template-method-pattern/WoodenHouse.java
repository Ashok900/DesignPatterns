package templatemethodpattern;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("Building wooden walls");
	}

	@Override
	public void buildPillers() {
		System.out.println("Building pillers with wood coating");
	}

}
