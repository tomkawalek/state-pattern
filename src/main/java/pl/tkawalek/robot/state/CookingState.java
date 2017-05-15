package pl.tkawalek.robot.state;

import pl.tkawalek.robot.Robot;

/**
 * Created by tkawalek on 15.05.2017.
 */
public class CookingState implements State {

    public static final State INSTANCE = new CookingState();

    public void walk(Robot robot) {
        System.out.println("Walking...");
        robot.changeState(OnState.INSTANCE);
    }

    public void cook(Robot robot) {
        System.out.println("Cooking...");
    }

    public void turnOff(Robot robot) {
        System.out.println("Cannot turn off while cooking!");
    }
}
