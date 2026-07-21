

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.robotcore.internal.camera.delegating.DelegatingCaptureSequence;

/*
 * Sample teleop opmode
 *
 */



public class Teleop extends LinearOpMode {

    public Hardware robot;
    @Override
    public void runOpMode() {
        robot = new Hardware(hardwareMap);
        robot.init();
        waitForStart();
        //wait for you to press start




        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            // Setup a variable for each drive wheel to save power level for telemetry
            double leftPower;
            double rightPower;

            // Choose to drive using either Tank Mode, or POV Mode
            // Comment out the method that's not used.  The default below is POV.

            // POV Mode uses left stick to go forward, and right stick to turn.
            // - This uses basic math to combine motions and is easier to drive straight.

            double drivepower = 0.8;

            double drive = gamepad1.left_stick_y;
            double turn  =  -gamepad1.right_stick_x;

            if (gamepad1.b) {
                 drive = gamepad1.left_stick_y/3;
                 turn  =  -gamepad1.right_stick_x/3;

            }






            leftPower    = Range.clip(drive + turn, -drivepower, drivepower) ;
            rightPower   = Range.clip(drive - turn, -drivepower, drivepower) ;








            robot.left.setPower(leftPower);
            robot.right.setPower(rightPower);

            if (gamepad2.y) {
                robot.openClaw();
            }
            if (gamepad2.b) {
                robot.closeClaw();
            }

            double arm = gamepad2.left_stick_y/2;
            double armpower = Range.clip(arm, -1,1);
            robot.arm.setPower(armpower);



            if (gamepad2.left_trigger_pressed) {
                robot.clawspin.setPosition(.595);
            }

            if (gamepad2.right_trigger_pressed) {
                robot.clawspin.setPosition(.238);
            }




//claw right 0 positions closed : .414 open : .562
//claw left  1 closed : .503 open : .366
//Clawspin 2 horzantal: .572 verticle .27 vertical x2 .872






        }

    }}
