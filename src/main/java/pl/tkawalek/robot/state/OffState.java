package pl.tkawalek.robot.state;

import pl.tkawalek.robot.Robot;

/**
 * Created by tkawalek on 15.05.2017.
 */
public class OffState implements State {

    public static final OffState INSTANCE = new OffState();

    public void walk(Robot robot) {
        System.out.println("Walking...");
        robot.changeState(OnState.INSTANCE);
    }

    public void cook(Robot robot) {
        System.out.println("Cannot cook while turned off!");
    }

    public void turnOff(Robot robot) {
        System.out.println("Already turned off.");
    }
}
