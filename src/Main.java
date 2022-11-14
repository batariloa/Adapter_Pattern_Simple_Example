public class Main {
    public static void main(String[] args) {

        EnemyTank x0007Tank = new EnemyTank();

        EnemyRobot bobbyRobot = new EnemyRobot();
        EnemyRobotAdapter adaptedBobbyRobot = new EnemyRobotAdapter(bobbyRobot);

        bobbyRobot.reactToHuman("Kyle");
        bobbyRobot.walkForward();

        x0007Tank.assignDriver("Johnny");
        x0007Tank.fireWeapon();

        adaptedBobbyRobot.driveForward();
        adaptedBobbyRobot.assignDriver("Michael");
        adaptedBobbyRobot.fireWeapon();



    }
}