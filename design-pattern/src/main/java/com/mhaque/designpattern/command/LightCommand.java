/**
 * Created by @authoer haquem on Mar 1, 2020 
 */
package com.mhaque.designpattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haquem
 *
 */
//Command
interface Command{
	void execute();
}

//Receiver
class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}

//Invoker
class Switch {
    private final Map<String, Command> commandMap = new HashMap<>();
    
    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }
    
    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }
}

//Client
public class LightCommand {
   public static void main(String[] args) {
	   Light lamp = new Light();

       Command switchOn = lamp::turnOn;
       Command switchOff = lamp::turnOff;

       Switch mySwitch = new Switch();
       mySwitch.register("on", switchOn);
       mySwitch.register("off", switchOff);

       mySwitch.execute("on");
       mySwitch.execute("off");
  }
}
