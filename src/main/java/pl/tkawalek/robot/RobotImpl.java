package pl.tkawalek.robot;

import pl.tkawalek.robot.state.OffState;
import pl.tkawalek.robot.state.State;

/**
 * Created by tkawalek on 15.05.2017.
 */
public class RobotImpl implements Robot {

    private State currentState;

    public RobotImpl() {
        currentState = OffState.INSTANCE;
    }

    public void makeDinner() {
        currentState.walk(this);
        currentState.cook(this);
        currentState.walk(this);
        currentState.turnOff(this);
        currentState.walk(this);
        currentState.turnOff(this);
        currentState.cook(this);
    }

    public void changeState(State newState) {
        currentState = newState;
    }
}
