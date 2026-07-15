package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name= "DVEGA Definetly very extremely good auto V1")
public class Auto extends LinearOpMode {
    public Hardware robot;
    @Override
    //run op mode waits for you to press innit
    public void runOpMode() throws InterruptedException {
        robot = new Hardware(hardwareMap);
        //wait for start :O
        robot.init();
        waitForStart();

       foward(1);
        sleep(1000);

       foward(0);
        robot.closeClaw();

        robot.right.setPower(1);
        robot.left.setPower(-1);

        sleep(500);

        robot.right.setPower(0);
        robot.left.setPower(0);
        turnleft(1);
    }

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

}
//192.168.43.1