package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){

        telemetry.addData("L_X", gamepad1.left_stick_x);
        telemetry.addData("L_Y", gamepad1.left_stick_y);
        telemetry.addData("R_X", gamepad1.right_stick_x);
        telemetry.addData("R_Y", gamepad1.right_stick_y);
    }

}
