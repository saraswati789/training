package statepatternproject;

public class OffState implements State {

	@Override
	public void nextStateAction(CeilingFan fan) {
		
		System.out.println("Fan started with low speed");
		fan.setCurrentState(new LowSpeedState());
	}

}
