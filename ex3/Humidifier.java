
package itec3030.assignments.a2.ex3;
public class Humidifier extends OurFurnaceDecorator {

	public Humidifier(OurFurnace n) {
		super(n);
	}
	
	@Override
	public void turnOn() {
		n.turnOn();
		setHumidifier(n);
	}
	
	private void setHumidifier(OurFurnace n) {
		System.out.println("Humidifier: On");
	}
	
}
