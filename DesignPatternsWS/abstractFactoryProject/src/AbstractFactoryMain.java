
import com.factory.*;
import com.product.*;

public class AbstractFactoryMain {

	public static void main(String[] args) {

		try {
			CarFactory factory = CarFactory.getCarFactory("maruti");

			Engine engine = factory.getEngine();
			Transmission trans = factory.getTransmission();

			engine.makeEngine();
			trans.makeTransmission();

			MarutiEngine e = new MarutiEngine();

		} catch (Exception e) {
			System.out.print("Factory cannot be created because");
			System.out.println(e.getMessage());
		}

	}

}
