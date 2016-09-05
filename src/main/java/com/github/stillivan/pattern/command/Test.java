package com.github.stillivan.pattern.command;

import com.github.stillivan.pattern.command.remote.CeilingFan;
import com.github.stillivan.pattern.command.remote.CeilingFanOffCommand;
import com.github.stillivan.pattern.command.remote.CeilingFanOnCommand;
import com.github.stillivan.pattern.command.remote.GarageDoor;
import com.github.stillivan.pattern.command.remote.GarageDoorDownCommand;
import com.github.stillivan.pattern.command.remote.GarageDoorOpenCommand;
import com.github.stillivan.pattern.command.remote.Light;
import com.github.stillivan.pattern.command.remote.LightOffCommand;
import com.github.stillivan.pattern.command.remote.LightOnCommand;
import com.github.stillivan.pattern.command.remote.RemoteControl;
import com.github.stillivan.pattern.command.remote.SimpleRemoteControl;
import com.github.stillivan.pattern.command.remote.Stereo;
import com.github.stillivan.pattern.command.remote.StereoOffCommand;
import com.github.stillivan.pattern.command.remote.StereoOnWithCDCommand;

/**
 * @author Charming
 * @since 2016-09-04 23:28
 */
public class Test {
    public static void simpleRemoteTest() {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }

    public static void remoteTest() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorDownCommand);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);

        System.out.println(remoteControl);
        for (int i = 0; i < 5; i++) {
            remoteControl.onButtonPushed(i);
            remoteControl.offButtonPushed(i);
        }
    }

    public static void main(String[] args) {
        //simpleRemoteTest();
        remoteTest();
    }
}
