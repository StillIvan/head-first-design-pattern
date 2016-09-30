package com.github.stillivan.pattern.state;

/**
 * @author Charming
 * @since 2016-09-30 23:21
 */
public class Test {
    private static void oldGumballMachineTest() {
        OldGumballMachine machine = new OldGumballMachine(5);

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println(machine.toString());
    }

    public static void main(String[] args) {
        oldGumballMachineTest();
    }
}
