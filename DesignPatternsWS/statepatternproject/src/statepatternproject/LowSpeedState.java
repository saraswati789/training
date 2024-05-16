package statepatternproject;

public class LowSpeedState implements State {

	@Override
	public void nextStateAction(CeilingFan fan) {
		
		System.out.println("Fan changed to medium speed");
		fan.setCurrentState(new MediumSpeedState());	
	}

}