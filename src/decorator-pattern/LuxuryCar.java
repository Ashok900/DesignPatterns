package decoratorPattern;

/*
 * Extending the base decorator functionality and modifying the component behavior accordingly. 
 * We can have concrete decorator classes as LuxuryCar and SportsCar.
 */
public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
	}
	
	public void assemble() {
		super.assemble();
		System.out.println(" Adding features of Luxury car..");
	}

}
