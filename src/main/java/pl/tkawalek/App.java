package pl.tkawalek;

import pl.tkawalek.robot.Robot;
import pl.tkawalek.robot.RobotImpl;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Robot robot = new RobotImpl();
        robot.makeDinner();
    }
}
