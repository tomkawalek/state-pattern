package pl.tkawalek.robot.state;

import pl.tkawalek.robot.Robot;

/**
 * Created by tkawalek on 15.05.2017.
 */
public interface State {

    void walk(Robot robot);
    void cook(Robot robot);
    void turnOff(Robot robot);
}
