package itec3030.assignments.a2.ex3;
public abstract class OurFurnaceDecorator implements OurFurnace {
	protected OurFurnace n;
	
	public OurFurnaceDecorator(OurFurnace n) {
		this.n = n;
	}
	
	public void turnOn() {
		n.turnOn();
	}
}
