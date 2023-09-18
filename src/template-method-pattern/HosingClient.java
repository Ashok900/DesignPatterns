package templatemethodpattern;

/*
 * Notice that client is invoking the template method of base class and depending of implementation of 
 * different steps, it’s using some of the methods from base class and some of them from subclass.
 */
public class HosingClient {
	public static void main(String[] args) {
		HouseTemplate houseType=new WoodenHouse();
		houseType.buildHouse();
		System.out.println("******************");
		houseType=new GlassHouse();
		houseType.buildHouse();
	}

}
