package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name= "DVEGA Definetly very extremely good auto V1")
public class Auto extends LinearOpMode {
    public Hardware robot;
    //run op mode waits for you to press innit


    public void turnleft(double power) {
        robot.right.setPower(power);
        robot.left.setPower(-power);
    }
    public void turnright(double power) {
        robot.right.setPower(-power);
        robot.left.setPower(power);
    }
    public void foward(double power) {
        robot.right.setPower(power);
        robot.left.setPower(power);

    }
    public void runOpMode() throws InterruptedException {
        robot = new Hardware(hardwareMap);
        //wait for start :O
        robot.init();
        waitForStart();

        robot.closeClaw();
        robot.arm.setPower(1);
        sleep(5000);

        robot.right.setPower(1);
        robot.left.setPower(1);
        sleep(2000);

        robot.right.setPower(-1);
        robot.left.setPower(1);
        sleep(5000);
        robot.arm.setPower(-1);
        sleep(5000);

        robot.openClaw();
    }


}
//192.168.43.1