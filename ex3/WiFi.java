package itec3030.assignments.a2.ex3;
public class WiFi extends OurFurnaceDecorator {

	public WiFi(OurFurnace n) {
		super(n);
	}
	
	@Override
	public void turnOn() {
		n.turnOn();
		setWifi(n);
	}
	
	private void setWifi(OurFurnace n) {
		System.out.println("Wifi: Initialized");
	}
	
	
}

	
	

