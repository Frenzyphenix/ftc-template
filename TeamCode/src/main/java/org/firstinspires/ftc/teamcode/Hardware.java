package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


public class Hardware {
    public DcMotor left;

    public DcMotor right;

    public Servo clawleft;
    public Servo clawright;
    public DcMotor arm;
    public Servo clawspin;

    


    public Hardware(HardwareMap hwMap) {
        //drive motor
        left = hwMap.get(DcMotor.class, "left");
        right = hwMap.get(DcMotor.class, "right");

        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        left.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        left.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        clawleft = hwMap.get(Servo.class, "clawleft");
        clawright = hwMap.get(Servo.class, "clawright");
        arm = hwMap.get(DcMotor.class, "arm");
        clawspin = hwMap.get(Servo.class,"clawspin");
        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);



    }

    public void init() {
        openClaw();
    }
    public void openClaw() {
        clawleft.setPosition(.366);
        clawright.setPosition(.562);
        
    }
    public void closeClaw() {
        clawleft.setPosition(.55);
        clawright.setPosition(.33);

    }
}
