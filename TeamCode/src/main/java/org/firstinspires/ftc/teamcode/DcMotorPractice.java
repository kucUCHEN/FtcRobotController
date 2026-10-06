package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.MotorControl;

@TeleOp
public class DcMotorPractice extends OpMode {

    MotorControl DcMotorControl = new MotorControl();

    @Override
    public void init(){
        DcMotorControl.init(hardwareMap);
    }

    @Override
    public void loop(){

        DcMotorControl.setMotorSpeed(0.5);
    }

}
