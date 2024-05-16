package statepatternproject;

public class CeilingFan {
	
	private State currentState;

	public CeilingFan() {
		this.currentState = new OffState();
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public void pullChain() {
		currentState.nextStateAction(this);
	}

}
