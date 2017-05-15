package pl.tkawalek.robot.state;

import pl.tkawalek.robot.Robot;

/**
 * Created by tkawalek on 15.05.2017.
 */
public class OnState implements State {

    public static final OnState INSTANCE = new OnState();

    public void walk(Robot robot) {
        System.out.println("Walking...");
    }

    public void cook(Robot robot) {
        System.out.println("Cooking...");
        robot.changeState(CookingState.INSTANCE);
    }

    public void turnOff(Robot robot) {
        System.out.println("Turning off...");
        robot.changeState(OffState.INSTANCE);
    }
}
