package decoratorproject;

public class DecoratorMain {

	public static void main(String[] args) {
		
		LivingThing animal  = new Animal();
		animal.describe();
		
		System.out.println("\nAfter adding LegDecorator to Animal");
		LegDecorator ld = new LegDecorator(animal);
		
		ld.describe();

		System.out.println("\nAfter adding WingsDecorator to Animal");
		WingsDecorator wd = new WingsDecorator(ld);
		
		
		wd.describe();
		
	}

}
