package pl.tkawalek.robot;

import pl.tkawalek.robot.state.State;

/**
 * Created by tkawalek on 15.05.2017.
 */
public interface Robot {

    void makeDinner();

    void changeState(State newState);

}
