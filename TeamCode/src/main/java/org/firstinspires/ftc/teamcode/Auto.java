package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name= "DVEGA")
public class Auto extends LinearOpMode {
    public Hardware robot;
    //run op mode waits for you to press innit

    public void runOpMode() throws InterruptedException {
        robot = new Hardware(hardwareMap);
        //wait for start :O
        robot.init();
        waitForStart();

        goforward(0.2, 2000);
        while (opModeIsActive()) {
            telemetry.addData("left curr", robot.left.getCurrentPosition());
            telemetry.addData("right curr", robot.right.getCurrentPosition());
            telemetry.addData("left target", robot.left.getTargetPosition());
            telemetry.addData("right target", robot.left.getTargetPosition());
            telemetry.update();
        }
    }

     public void goforward(double power, int ticks) {
        robot.left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        robot.left.setTargetPosition(ticks);
        robot.right.setTargetPosition(ticks);

        robot.left.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.right.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        robot.left.setPower(power);
        robot.right.setPower(power);

    }


}












//192.168.43.1