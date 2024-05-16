package decoratorproject;

public class LegDecorator extends AbstractDecorator {

	
	public LegDecorator(LivingThing l) {
		super(l);

	}
	
	@Override
	public void describe() {
		livingThing.describe();
		System.out.println("I have legs");
		walk();
	}
	
	private void walk() {
		System.out.println("I can walk");
	}
		
}
